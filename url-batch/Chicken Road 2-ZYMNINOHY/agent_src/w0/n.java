package w0;

import android.content.Context;
import android.util.Range;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15864a;

    /* renamed from: b, reason: collision with root package name */
    public final u f15865b;

    /* renamed from: c, reason: collision with root package name */
    public q f15866c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15867d;

    /* renamed from: e, reason: collision with root package name */
    public W.D f15868e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15869f;

    /* renamed from: g, reason: collision with root package name */
    public long f15870g = 15000;

    /* renamed from: h, reason: collision with root package name */
    public final v f15871h;

    public n(Context context, u uVar) {
        this.f15864a = context.getApplicationContext();
        this.f15865b = uVar;
        v vVar = new v();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        vVar.f15912d = range;
        vVar.f15911c = ((Double) range.getUpper()).doubleValue();
        vVar.f15909a = -9223372036854775807L;
        vVar.f15910b = -9223372036854775807L;
        this.f15871h = vVar;
        this.f15868e = W.D.f3254a;
    }
}
