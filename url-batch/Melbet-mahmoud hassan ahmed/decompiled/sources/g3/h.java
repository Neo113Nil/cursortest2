package g3;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.e02;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.vi0;
import com.google.android.gms.internal.ads.xa3;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class h implements xa3<vi0, j> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16650a;

    /* renamed from: b, reason: collision with root package name */
    private final e02 f16651b;

    public h(Executor executor, e02 e02Var) {
        this.f16650a = executor;
        this.f16651b = e02Var;
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final /* bridge */ /* synthetic */ cc3<j> c(vi0 vi0Var) {
        final vi0 vi0Var2 = vi0Var;
        return rb3.n(this.f16651b.b(vi0Var2), new xa3() { // from class: g3.g
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                vi0 vi0Var3 = vi0.this;
                j jVar = new j(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    jVar.f16656b = y2.t.q().M(vi0Var3.f13401f).toString();
                } catch (JSONException unused) {
                    jVar.f16656b = "{}";
                }
                return rb3.i(jVar);
            }
        }, this.f16650a);
    }
}
