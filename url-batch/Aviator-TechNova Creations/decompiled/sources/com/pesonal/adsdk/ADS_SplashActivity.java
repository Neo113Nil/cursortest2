package com.pesonal.adsdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.security.MessageDigest;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ADS_SplashActivity extends AppCompatActivity {
    public static String auth_key;
    boolean is_retry;
    FirebaseRemoteConfig mFirebaseRemoteConfig;
    public boolean need_internet = false;
    private Handler refreshHandler;
    private Runnable runnable;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void ADSinit(final Activity activity, final String str, final int i, final getDataListner getdatalistner) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences("ad_pref", 0);
        final SharedPreferences.Editor edit = sharedPreferences.edit();
        final Dialog dialog = new Dialog(activity);
        try {
            dialog.setCancelable(false);
            View inflate = getLayoutInflater().inflate(R.layout.retry_layout, (ViewGroup) null);
            dialog.setContentView(inflate);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setLayout(-1, -2);
            TextView textView = (TextView) inflate.findViewById(R.id.retry_buttton);
            this.need_internet = sharedPreferences.getBoolean("need_internet", this.need_internet);
            if (!isNetworkAvailable() && this.need_internet) {
                this.is_retry = false;
                dialog.show();
            }
            dialog.dismiss();
            Handler handler = new Handler();
            this.refreshHandler = handler;
            Runnable runnable = new Runnable() { // from class: com.pesonal.adsdk.ADS_SplashActivity.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ADS_SplashActivity.this.isNetworkAvailable()) {
                        ADS_SplashActivity.this.is_retry = true;
                    } else if (ADS_SplashActivity.this.need_internet) {
                        dialog.show();
                        ADS_SplashActivity.this.is_retry = false;
                    }
                    ADS_SplashActivity.this.refreshHandler.postDelayed(this, 1000L);
                }
            };
            this.runnable = runnable;
            handler.postDelayed(runnable, 1000L);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.ADS_SplashActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ADS_SplashActivity aDS_SplashActivity = ADS_SplashActivity.this;
                    if (!aDS_SplashActivity.is_retry) {
                        aDS_SplashActivity.startActivityForResult(new Intent("android.settings.SETTINGS"), 0);
                    } else if (!aDS_SplashActivity.need_internet) {
                        getdatalistner.onsuccess();
                    } else {
                        dialog.dismiss();
                        getdatalistner.reloadActivity();
                    }
                }
            });
        } catch (Exception unused) {
        }
        AppManage.mysharedpreferences = activity.getSharedPreferences(activity.getPackageName(), 0);
        this.mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        this.mFirebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(1L).build());
        this.mFirebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(this, new OnCompleteListener() { // from class: com.pesonal.adsdk.ADS_SplashActivity.3
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                String string;
                if (!task.isSuccessful()) {
                    if (!ADS_SplashActivity.this.need_internet) {
                        getdatalistner.onsuccess();
                        return;
                    }
                    dialog.dismiss();
                    ADS_SplashActivity.this.refreshHandler = new Handler();
                    ADS_SplashActivity.this.runnable = new Runnable() { // from class: com.pesonal.adsdk.ADS_SplashActivity.3.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ADS_SplashActivity.this.isNetworkAvailable()) {
                                ADS_SplashActivity.this.is_retry = true;
                            } else {
                                dialog.show();
                                ADS_SplashActivity.this.is_retry = false;
                            }
                            ADS_SplashActivity.this.refreshHandler.postDelayed(this, 1000L);
                        }
                    };
                    return;
                }
                try {
                    try {
                        PackageInfo packageInfo = ADS_SplashActivity.this.getPackageManager().getPackageInfo(ADS_SplashActivity.this.getPackageName(), 64);
                        StringBuilder sb = new StringBuilder("SHA");
                        for (Signature signature : packageInfo.signatures) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                            messageDigest.update(signature.toByteArray());
                            byte[] digest = messageDigest.digest();
                            for (byte b : digest) {
                                String hexString = Integer.toHexString(b & 255);
                                if (hexString.length() == 1) {
                                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                                }
                                sb.append(hexString);
                            }
                        }
                        try {
                            for (Signature signature2 : ADS_SplashActivity.this.getPackageManager().getPackageInfo(ADS_SplashActivity.this.getPackageName(), 64).signatures) {
                                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA");
                                messageDigest2.update(signature2.toByteArray());
                                ADS_SplashActivity.auth_key = new String(Base64.encode(messageDigest2.digest(), 0)).replace("\n", "").trim();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        string = FirebaseRemoteConfig.getInstance().getString(sb.toString());
                    } catch (Exception unused2) {
                        String str2 = str;
                        string = (str2 == null || !str2.toLowerCase().contains("gclid")) ? FirebaseRemoteConfig.getInstance().getString("Aviator") : FirebaseRemoteConfig.getInstance().getString("AviatorCamp");
                    }
                    if (string.isEmpty()) {
                        String str3 = str;
                        string = (str3 == null || !str3.toLowerCase().contains("gclid")) ? FirebaseRemoteConfig.getInstance().getString("Aviator") : FirebaseRemoteConfig.getInstance().getString("AviatorCamp");
                    }
                    try {
                        ADS_SplashActivity.this.need_internet = new JSONObject(string).getString("app_needInternet").endsWith(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                        edit.putBoolean("need_internet", ADS_SplashActivity.this.need_internet).apply();
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    AppManage.getInstance(activity).getResponseFromPref(string, new getDataListner() { // from class: com.pesonal.adsdk.ADS_SplashActivity.3.1
                        @Override // com.pesonal.adsdk.getDataListner
                        public final void onRedirect(String str4) {
                            getdatalistner.onRedirect(str4);
                        }

                        @Override // com.pesonal.adsdk.getDataListner
                        public final void onUpdate(String str4) {
                            getdatalistner.onUpdate(str4);
                        }

                        @Override // com.pesonal.adsdk.getDataListner
                        public final void ongetExtradata(JSONObject jSONObject) {
                        }

                        @Override // com.pesonal.adsdk.getDataListner
                        public final void onsuccess() {
                            getdatalistner.onsuccess();
                        }

                        @Override // com.pesonal.adsdk.getDataListner
                        public final void reloadActivity() {
                        }
                    }, i);
                } catch (Exception unused3) {
                    if (!ADS_SplashActivity.this.need_internet) {
                        getdatalistner.onsuccess();
                        return;
                    }
                    dialog.dismiss();
                    ADS_SplashActivity.this.refreshHandler = new Handler();
                    ADS_SplashActivity.this.runnable = new Runnable() { // from class: com.pesonal.adsdk.ADS_SplashActivity.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ADS_SplashActivity.this.isNetworkAvailable()) {
                                ADS_SplashActivity.this.is_retry = true;
                            } else {
                                dialog.show();
                                ADS_SplashActivity.this.is_retry = false;
                            }
                            ADS_SplashActivity.this.refreshHandler.postDelayed(this, 1000L);
                        }
                    };
                }
            }
        });
    }

    public int getCurrentVersionCode() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ads_splash);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.refreshHandler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
    }

    public void showRedirectDialog(final String str) {
        final Dialog dialog = new Dialog(this, R.style.FullWidth_Dialog);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_update);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.img);
        ImageView imageView2 = (ImageView) dialog.findViewById(R.id.img1);
        imageView.setVisibility(8);
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.ic_new_app_install);
        TextView textView = (TextView) dialog.findViewById(R.id.txtUpdate);
        TextView textView2 = (TextView) dialog.findViewById(R.id.txtMsg);
        ((TextView) dialog.findViewById(R.id.txtTitle)).setText("Install our new app now and enjoy");
        textView2.setText("We have transferred our server, so install our new app by clicking the button below to enjoy the new features of app.");
        textView.setText("Install Now");
        textView.getBackground().setTint(Color.parseColor("#00771D"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.ADS_SplashActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADS_SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                dialog.dismiss();
                ADS_SplashActivity.this.finish();
            }
        });
        dialog.show();
    }

    public void showupdateDialog() {
        Dialog dialog = new Dialog(this, R.style.FullWidth_Dialog);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.dialog_update);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.img);
        dialog.findViewById(R.id.img1).setVisibility(8);
        imageView.setVisibility(0);
        ((TextView) dialog.findViewById(R.id.txtTitle)).setText("Update available");
        ((TextView) dialog.findViewById(R.id.txtMsg)).setText("Update our new app now and enjoy");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.update_img));
        TextView textView = (TextView) dialog.findViewById(R.id.txtUpdate);
        textView.setText("Update Now");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.pesonal.adsdk.ADS_SplashActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADS_SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + ADS_SplashActivity.this.getPackageName())));
            }
        });
        dialog.show();
    }
}
