package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ey implements ComponentRegistrarProcessor, bf0, FacebookSdk.GraphRequestCreator, FeatureManager.Callback, p30 {
    public final /* synthetic */ int m;

    public /* synthetic */ ey(int i) {
        this.m = i;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void d(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new FacebookException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return DeleteRangeGesture.class;
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return DeleteGesture.class;
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return SelectRangeGesture.class;
    }

    @Override // com.facebook.FacebookSdk.GraphRequestCreator
    public GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.graphRequestCreator$lambda$0(accessToken, str, jSONObject, callback);
    }

    @Override // defpackage.p30
    public Object g(jt2 jt2Var) {
        Integer lambda$startMessagingService$1;
        Integer lambda$bindToMessagingService$3;
        switch (this.m) {
            case 26:
                lambda$startMessagingService$1 = FcmBroadcastProcessor.lambda$startMessagingService$1(jt2Var);
                return lambda$startMessagingService$1;
            default:
                lambda$bindToMessagingService$3 = FcmBroadcastProcessor.lambda$bindToMessagingService$3(jt2Var);
                return lambda$bindToMessagingService$3;
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        switch (this.m) {
            case 21:
                FacebookSdk.sdkInitialize$lambda$4(z);
                break;
            case 22:
                FacebookSdk.sdkInitialize$lambda$5(z);
                break;
            case 23:
                FacebookSdk.sdkInitialize$lambda$6(z);
                break;
            case 24:
                FacebookSdk.sdkInitialize$lambda$7(z);
                break;
            default:
                FacebookSdk.sdkInitialize$lambda$8(z);
                break;
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.bf0
    public float a(float f) {
        return f;
    }
}
