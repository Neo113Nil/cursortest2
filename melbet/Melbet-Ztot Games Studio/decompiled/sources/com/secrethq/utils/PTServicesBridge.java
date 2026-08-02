package com.secrethq.utils;

import android.R;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.secrethq.store.PTStoreBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.IntBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import org.cocos2dx.lib.Cocos2dxActivity;

/* loaded from: classes3.dex */
public class PTServicesBridge extends BackupAgent implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final String PREFS = "buildbox_bb3_user_progress";
    public static final String PREFS_BACKUP_KEY = "progress";
    public static final int RC_SIGN_IN = 9001;
    private static final int REQUEST_LEADERBOARD = 5000;
    private static final String TAG = "PTServicesBridge";
    private static Cocos2dxActivity activity = null;
    public static final String kInAppIdsPrefs = "com.buildbox.kInAppIdsPrefs";
    public static final String kInAppIdsPrefsKey = "com.buildbox.kInAppIdsPrefs.key";
    public static final String kPTServicesFirstLaunchKey = "com.buildbox.kPTServicesFirstLaunchKey";
    private static BackupManager mBackupManager;
    private static GoogleApiClient mGoogleApiClient;
    private static PTServicesBridge sInstance;
    private static WeakReference<Cocos2dxActivity> s_activity;
    private static int scoreValue;
    private static String urlString;

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getLeaderboardId();

    public static native void noGameBackupData();

    public static native boolean removeAds();

    public static native void restoreCompleted(String str);

    public static native void shouldRestoreBackup(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void warningMessageClicked(boolean z);

    public static PTServicesBridge instance() {
        if (sInstance == null) {
            sInstance = new PTServicesBridge();
        }
        return sInstance;
    }

    public static void initBridge(Cocos2dxActivity cocos2dxActivity, String str) {
        Log.v(TAG, "PTServicesBridge  -- INIT");
        s_activity = new WeakReference<>(cocos2dxActivity);
        activity = cocos2dxActivity;
        mBackupManager = new BackupManager(cocos2dxActivity);
        if (str == null || str.length() == 0 || !str.matches("[0-9]+")) {
            return;
        }
        if (cocos2dxActivity.getPreferences(0).getBoolean("GooglePlayServiceSignInError", false)) {
            Log.v(TAG, "Skipping logging in Google Play services");
        } else {
            mGoogleApiClient = new GoogleApiClient.Builder(activity).addApi(Games.API).addScope(Games.SCOPE_GAMES).addConnectionCallbacks(instance()).addOnConnectionFailedListener(instance()).build();
        }
    }

    public static void openShareWidget(final String str) {
        GLSurfaceView gLSurfaceView;
        View findViewById = activity.findViewById(R.id.content);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById).getChildAt(0);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof GLSurfaceView) {
                    gLSurfaceView = (GLSurfaceView) childAt;
                    break;
                }
            }
        }
        gLSurfaceView = null;
        final int width = gLSurfaceView.getWidth();
        final int height = gLSurfaceView.getHeight();
        if (gLSurfaceView != null) {
            gLSurfaceView.queueEvent(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.1
                @Override // java.lang.Runnable
                public void run() {
                    Bitmap createBitmapFromGLSurface = PTServicesBridge.createBitmapFromGLSurface(0, 0, width, height, (GL10) ((EGL10) EGLContext.getEGL()).eglGetCurrentContext().getGL());
                    try {
                        final File createTempFile = File.createTempFile("screenshot", ".png", PTServicesBridge.activity.getExternalCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        createBitmapFromGLSurface.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        PTServicesBridge.activity.runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
                                Log.v(PTServicesBridge.TAG, "PTServicesBridge  -- openShareWidget with text:" + str);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("image/*");
                                intent.putExtra("android.intent.extra.TEXT", str);
                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(createTempFile));
                                PTServicesBridge.activity.startActivity(Intent.createChooser(intent, "Share"));
                            }
                        });
                    } catch (Exception unused) {
                        Log.d(PTServicesBridge.TAG, "Screenshot writing Error");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap createBitmapFromGLSurface(int i, int i2, int i3, int i4, GL10 gl10) {
        int i5 = i3 * i4;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        try {
            gl10.glReadPixels(i, i2, i3, i4, 6408, 5121, wrap);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i6 * i3;
                int i8 = ((i4 - i6) - 1) * i3;
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = iArr[i7 + i9];
                    iArr2[i8 + i9] = (i10 & (-16711936)) | ((i10 << 16) & 16711680) | ((i10 >> 16) & 255);
                }
            }
            return Bitmap.createBitmap(iArr2, i3, i4, Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            Log.e(TAG, "createBitmapFromGLSurface: " + e.getMessage(), e);
            return null;
        }
    }

    public static int availableProcessors() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        Log.d(TAG, "availableProcessors: " + availableProcessors);
        return availableProcessors;
    }

    public static int getCoresNumber() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.secrethq.utils.PTServicesBridge.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]+", file.getName());
                }
            });
            Log.d(TAG, "CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            Log.d(TAG, "CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }

    public static void openUrl(String str) {
        Log.v(TAG, "PTServicesBridge  -- Open URL " + str);
        urlString = str;
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    PTServicesBridge.activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(PTServicesBridge.urlString)));
                } catch (Exception e) {
                    Log.d(PTServicesBridge.TAG, "OpenURL: Failed.");
                    e.printStackTrace();
                }
            }
        });
    }

    public static void showLeaderboard() {
        Log.v(TAG, "PTServicesBridge  -- Show Leaderboard ");
        GoogleApiClient googleApiClient = mGoogleApiClient;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            Log.e(TAG, "Google play Servioces is not sigend");
        } else {
            s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.3
                @Override // java.lang.Runnable
                public void run() {
                    String leaderboardId = PTServicesBridge.getLeaderboardId();
                    if (leaderboardId == null || leaderboardId.isEmpty()) {
                        return;
                    }
                    PTServicesBridge.activity.startActivityForResult(Games.Leaderboards.getLeaderboardIntent(PTServicesBridge.mGoogleApiClient, leaderboardId), PTServicesBridge.REQUEST_LEADERBOARD);
                }
            });
        }
    }

    public static void showCustomFullScreenAd() {
        Log.e(TAG, "PTServicesBridge  -- showCustomFullScreenAd");
    }

    public static void screenOnEnter(String str) {
        Log.e(TAG, "PTServicesBridge  -- screenOnEnter");
    }

    public static void screenOnExit(String str) {
        Log.e(TAG, "PTServicesBridge  -- screenOnExit");
    }

    public static void sceneOnEnter(String str) {
        Log.e(TAG, "PTServicesBridge  -- sceneOnEnter");
    }

    public static void sceneOnExit(String str) {
        Log.e(TAG, "PTServicesBridge  -- sceneOnExit");
    }

    public static void loadingDidComplete() {
        Log.e(TAG, "PTServicesBridge  -- loadingDidComplete");
    }

    public static void submitScrore(int i) {
        Log.v(TAG, "PTServicesBridge  -- Submit Score " + i);
        GoogleApiClient googleApiClient = mGoogleApiClient;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            Log.e(TAG, "Google play Services is not sigend");
            return;
        }
        String leaderboardId = getLeaderboardId();
        if (leaderboardId == null || leaderboardId.isEmpty()) {
            return;
        }
        scoreValue = i;
        if (mGoogleApiClient.isConnected()) {
            Games.Leaderboards.submitScore(mGoogleApiClient, leaderboardId, scoreValue);
        }
    }

    public static boolean isRunningOnTV() {
        if (((UiModeManager) activity.getSystemService("uimode")).getCurrentModeType() == 4) {
            Log.d("DeviceTypeRuntimeCheck", "Running on a TV Device");
            return true;
        }
        Log.d("DeviceTypeRuntimeCheck", "Running on a non-TV Device");
        return false;
    }

    public static void showFacebookPage(final String str, final String str2) {
        Log.v(TAG, "Show facebook page for URL: " + str + " ID: " + str2);
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    PTServicesBridge.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/" + str2)));
                } catch (Exception e) {
                    Log.v(PTServicesBridge.TAG, "Show facebook FAILED going to exception handler : " + e.getMessage());
                    try {
                        PTServicesBridge.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (Exception e2) {
                        Log.v(PTServicesBridge.TAG, "Show facebook exception handle FAILED : " + e2.getMessage());
                    }
                }
            }
        });
    }

    public static void showWarningMessage(final String str) {
        Log.v(TAG, "Show warning with message: " + str);
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.5
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(PTServicesBridge.activity);
                builder.setMessage(str);
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.5.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        PTServicesBridge.warningMessageClicked(false);
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.5.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        PTServicesBridge.warningMessageClicked(true);
                    }
                });
                builder.setCancelable(true);
                builder.create().show();
            }
        });
    }

    public static void loginGameServices() {
        Log.v(TAG, "PTServicesBridge  -- Login Game Services ");
        GoogleApiClient googleApiClient = mGoogleApiClient;
        if (googleApiClient != null) {
            googleApiClient.connect();
        }
    }

    public static boolean isGameServiceAvialable() {
        GoogleApiClient googleApiClient = mGoogleApiClient;
        return googleApiClient != null && googleApiClient.isConnected();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        Log.v(TAG, "PTServicesBridge  -- API Client Connected bundle:" + bundle);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        Log.v(TAG, "PTServicesBridge  -- API Client Connection Suspended ");
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.v(TAG, "PTServicesBridge  -- API Client Connection FAILED:" + connectionResult);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, 9001);
            } catch (IntentSender.SendIntentException unused) {
                mGoogleApiClient.connect();
            }
        }
    }

    public static void backButtonPressed() {
        Log.v(TAG, "PTServicesBridge -- backButtonPressed");
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge.6
            @Override // java.lang.Runnable
            public void run() {
                PTServicesBridge.activity.moveTaskToBack(true);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9001 && i2 == -1) {
            mGoogleApiClient.connect();
        }
    }

    public static String sha1(byte[] bArr, int i) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArr, 0, i);
        return convertToHex(messageDigest.digest());
    }

    public static Object sha1Init() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException unused) {
            Log.e(TAG, "PTServicesBridge -- NoSuchAlgorithmException");
            return null;
        }
    }

    public static void sha1Update(Object obj, byte[] bArr, int i) {
        ((MessageDigest) obj).update(bArr, 0, i);
    }

    public static String sha1Finish(Object obj) {
        byte[] digest = ((MessageDigest) obj).digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static String convertToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                sb.append((char) ((i < 0 || i > 9) ? i + 87 : i + 48));
                i = b & Ascii.SI;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    public static void backupData(String str, String str2) {
        if (activity == null) {
            Log.d(TAG, "activity is null.");
            return;
        }
        try {
            String encrypt = AESHelper.encrypt(str);
            SharedPreferences.Editor edit = activity.getSharedPreferences(PREFS, 0).edit();
            edit.putString("progress", encrypt);
            edit.commit();
            mBackupManager.dataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void restoreData(String str) {
        boolean isFirstLaunch = isFirstLaunch("");
        String string = activity.getSharedPreferences(PREFS, 0).getString("progress", "");
        if (string == null || string.isEmpty() || !isFirstLaunch) {
            Log.v(TAG, "no game backup data found");
            noGameBackupData();
        } else {
            Log.v(TAG, "game backup data found, prompt to restore");
            promptRestoreData();
        }
    }

    public static void promptRestoreData() {
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PTServicesBridge.lambda$promptRestoreData$0();
            }
        });
    }

    static /* synthetic */ void lambda$promptRestoreData$0() {
        AlertDialog create = new AlertDialog.Builder(activity).create();
        create.setTitle("Restore Progress?");
        create.setMessage("We found records for your previous progress in this game from another installation. Would you like to keep it on this device?");
        create.setButton(-1, "Yes", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PTServicesBridge.shouldRestoreBackup(true);
                dialogInterface.dismiss();
            }
        });
        create.setButton(-2, "No", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PTServicesBridge.showAppClosePrompt();
            }
        });
        create.show();
    }

    public static boolean isFirstLaunch(String str) {
        Log.v(TAG, "PTServicesBridge -- check isFirstLaunch " + str);
        return !PreferenceManager.getDefaultSharedPreferences(activity).getBoolean(kPTServicesFirstLaunchKey, false);
    }

    public static void setDidFirstLaunch(String str) {
        Log.v(TAG, "PTServicesBridge -- set didFirstLaunch " + str);
        PreferenceManager.getDefaultSharedPreferences(activity).edit().putBoolean(kPTServicesFirstLaunchKey, true).apply();
    }

    public static void setInAppPurchaseInfo(ArrayList<Pair<String, String>> arrayList) {
        Log.v(TAG, "PTServicesBridge -- setInAppPurchaseInfo " + arrayList);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("id", (String) next.first);
            hashMap.put("type", (String) next.second);
            arrayList2.add(hashMap);
        }
        String json = new Gson().toJson(arrayList2);
        SharedPreferences.Editor edit = activity.getSharedPreferences(kInAppIdsPrefs, 0).edit();
        edit.putString(kInAppIdsPrefsKey, json);
        edit.commit();
        PTStoreBridge.beginLoadingProductDetails();
    }

    public static ArrayList<HashMap<String, String>> getInAppPurchaseInfo() {
        Log.v(TAG, "PTServicesBridge -- getInAppPurchaseInfo");
        String string = activity.getSharedPreferences(kInAppIdsPrefs, 0).getString(kInAppIdsPrefsKey, "{}");
        if (string.equals("{}")) {
            return new ArrayList<>();
        }
        return (ArrayList) new Gson().fromJson(string, new TypeToken<ArrayList<HashMap<String, String>>>() { // from class: com.secrethq.utils.PTServicesBridge.9
        }.getType());
    }

    public static ArrayList<String> getInAppIds(String str) {
        ArrayList<HashMap<String, String>> inAppPurchaseInfo = getInAppPurchaseInfo();
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            Iterator<HashMap<String, String>> it = inAppPurchaseInfo.iterator();
            while (it.hasNext()) {
                HashMap<String, String> next = it.next();
                if (next.get("type").equals(str)) {
                    arrayList.add(next);
                }
            }
            inAppPurchaseInfo = arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<HashMap<String, String>> it2 = inAppPurchaseInfo.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().get("id"));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showAppClosePrompt() {
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.utils.PTServicesBridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PTServicesBridge.lambda$showAppClosePrompt$1();
            }
        });
    }

    static /* synthetic */ void lambda$showAppClosePrompt$1() {
        AlertDialog create = new AlertDialog.Builder(activity).create();
        create.setTitle("Clear Saved Data?");
        create.setMessage("To delete all the saved data, Game will close itself. You can launch it again.");
        create.setButton(-1, "Cancel", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PTServicesBridge.shouldRestoreBackup(false);
                dialogInterface.dismiss();
            }
        });
        create.setButton(-2, "Ok", new DialogInterface.OnClickListener() { // from class: com.secrethq.utils.PTServicesBridge.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PTServicesBridge.clearAppData();
                PTServicesBridge.shouldRestoreBackup(false);
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    @Override // android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        Log.v(TAG, "PTServicesBridge -- onBackup");
        new DataInputStream(new FileInputStream(parcelFileDescriptor.getFileDescriptor()));
        String string = activity.getSharedPreferences(PREFS, 0).getString("progress", "");
        if (string == "") {
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new DataOutputStream(byteArrayOutputStream).writeUTF(string);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            backupDataOutput.writeEntityHeader(PREFS, length);
            backupDataOutput.writeEntityData(byteArray, length);
            new DataOutputStream(new FileOutputStream(parcelFileDescriptor2.getFileDescriptor())).writeLong(Calendar.getInstance().getTime().getTime());
        } catch (IOException unused) {
            Log.d(TAG, "PTServicesBridge -- unable to create backup");
        }
    }

    @Override // android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        Log.v(TAG, "PTServicesBridge -- onRestore");
        String str = "";
        while (backupDataInput.readNextHeader()) {
            String key = backupDataInput.getKey();
            int dataSize = backupDataInput.getDataSize();
            if (PREFS.equals(key)) {
                byte[] bArr = new byte[dataSize];
                backupDataInput.readEntityData(bArr, 0, dataSize);
                try {
                    str = AESHelper.decrypt(new DataInputStream(new ByteArrayInputStream(bArr)).readUTF());
                    restoreCompleted(str);
                } catch (Exception unused) {
                    Log.d(TAG, "PTServicesBridge -- unable to restore backup");
                }
            } else {
                Log.d(TAG, "PTServicesBridge -- unrecognized entity key in restoring backup");
                backupDataInput.skipEntityData();
            }
        }
        new DataOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor())).writeUTF(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearAppData() {
        try {
            if (((ActivityManager) activity.getSystemService("activity")).clearApplicationUserData()) {
                Log.d("", "Clean Successful");
            } else {
                Log.d("", "Clean Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
