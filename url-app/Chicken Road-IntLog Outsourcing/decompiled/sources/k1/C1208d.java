package k1;

import I1.o;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1208d implements I1.a, I1.g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1208d f10682b = new C1208d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1208d f10683c = new C1208d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1208d f10684d = new C1208d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10685a;

    public /* synthetic */ C1208d(int i2) {
        this.f10685a = i2;
    }

    @Override // I1.g
    public o a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = C1206b.f10671h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? B0.f.r(bundle) : B0.f.r(null);
    }

    @Override // I1.a
    public Object j(Task task) {
        switch (this.f10685a) {
            case 0:
                if (task.e()) {
                    return (Bundle) task.c();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.b())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.b());
            default:
                Intent intent = (Intent) ((Bundle) task.c()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1205a(intent);
                }
                return null;
        }
    }
}
