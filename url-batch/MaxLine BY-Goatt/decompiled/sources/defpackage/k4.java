package defpackage;

import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.GraphResponse;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.gamingservices.ContextChooseDialog;
import com.facebook.gamingservices.ContextCreateDialog;
import com.facebook.gamingservices.ContextSwitchDialog;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.login.FBLoginSSOLauncher;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.facebook.login.widget.ProfilePictureView;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.ServiceStarter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements u3, DaemonRequest.Callback, FeatureManager.Callback, LoginClient.OnCompletedListener, FileDownloadTask.Callback, ImageRequest.Callback, cs2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ k4(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.u3
    public void a(Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                ((Function1) ((zn1) obj2).getValue()).invoke(obj);
                break;
            case 5:
                FBLoginSSOLauncher._init_$lambda$0((FBLoginSSOLauncher) obj2, (t3) obj);
                break;
            default:
                LoginFragment.onCreate$lambda$1((Function1) obj2, (t3) obj);
                break;
        }
    }

    @Override // defpackage.cs2
    public Object b() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                tc2 tc2Var = ((f33) obj).i;
                SQLiteDatabase b = tc2Var.b();
                b.beginTransaction();
                try {
                    b.compileStatement("DELETE FROM log_event_dropped").execute();
                    b.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + tc2Var.n.h()).execute();
                    b.setTransactionSuccessful();
                    return null;
                } finally {
                    b.endTransaction();
                }
            default:
                js0 js0Var = (js0) obj;
                Iterator it = ((Iterable) ((tc2) js0Var.n).m(new b71())).iterator();
                while (it.hasNext()) {
                    ((mh) js0Var.o).C((gm) it.next(), 1, false);
                }
                return null;
        }
    }

    public bt c(mh mhVar) {
        ct ctVar = (ct) this.n;
        URL url = (URL) mhVar.n;
        String G = s93.G("CctTransportBackend");
        if (Log.isLoggable(G, 4)) {
            Log.i(G, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(ctVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mhVar.p;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ctVar.a.encode((sl) mhVar.o, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String G2 = s93.G("CctTransportBackend");
                    if (Log.isLoggable(G2, 4)) {
                        Log.i(G2, String.format("Status Code: %d", valueOf));
                    }
                    s93.C("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    s93.C("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new bt(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new bt(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            bt btVar = new bt(responseCode, null, am.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return btVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            s93.D("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bt(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            s93.D("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bt(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            s93.D("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bt(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (IOException e4) {
            e = e4;
            s93.D("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bt(400, null, 0L);
        }
    }

    public void d() {
        Function2 function2 = (Function2) this.n;
        synchronized (tm2.c) {
            List list = tm2.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(rv.l(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && Intrinsics.b(obj, function2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            tm2.h = arrayList;
            Unit unit = Unit.a;
        }
    }

    public boolean e(at0 at0Var, int i, Bundle bundle) {
        k20 k20Var;
        vf vfVar = (vf) this.n;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((s21) at0Var.m).e();
                Parcelable parcelable = (Parcelable) ((s21) at0Var.m).b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        s21 s21Var = (s21) at0Var.m;
        ClipData clipData = new ClipData(s21Var.a(), new ClipData.Item(s21Var.d()));
        if (i2 >= 31) {
            k20Var = new j20(clipData, 2);
        } else {
            l20 l20Var = new l20();
            l20Var.b = clipData;
            l20Var.c = 2;
            k20Var = l20Var;
        }
        k20Var.d(s21Var.f());
        k20Var.setExtras(bundle);
        return e53.g(vfVar, k20Var.build()) == null;
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public void onComplete(File file) {
        ModelManager.TaskHandler.Companion.execute$lambda$1((List) this.n, file);
    }

    @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
    public void onCompleted(GraphResponse graphResponse) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 2:
                ContextChooseDialog.showForCloud$lambda$2((ContextChooseDialog) obj, graphResponse);
                break;
            case 3:
                ContextCreateDialog.showForCloud$lambda$2((ContextCreateDialog) obj, graphResponse);
                break;
            default:
                ContextSwitchDialog.showForCloud$lambda$2((ContextSwitchDialog) obj, graphResponse);
                break;
        }
    }

    @Override // com.facebook.internal.ImageRequest.Callback
    public void onCompleted(ImageResponse imageResponse) {
        ProfilePictureView.sendImageRequest$lambda$2((ProfilePictureView) this.n, imageResponse);
    }

    @Override // com.facebook.login.LoginClient.OnCompletedListener
    public void onCompleted(LoginClient.Result result) {
        LoginFragment.onCreate$lambda$0((LoginFragment) this.n, result);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        FacebookException._init_$lambda$0((String) this.n, z);
    }
}
