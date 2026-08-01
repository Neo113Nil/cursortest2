package y6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements w7.a, kotlin.coroutines.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f10640d = new d();

    @Override // w7.a
    public /* synthetic */ Object f(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
