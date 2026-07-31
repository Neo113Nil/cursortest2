package f1;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f2669a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f2670b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2671c;

    public j(Path path) {
        this.f2669a = path;
    }

    public static void a(j jVar, e1.d dVar) {
        if (jVar.f2670b == null) {
            jVar.f2670b = new RectF();
        }
        RectF rectF = jVar.f2670b;
        q6.i.b(rectF);
        float f6 = dVar.f2461a;
        long j7 = dVar.f2468h;
        long j8 = dVar.f2467g;
        long j9 = dVar.f2466f;
        long j10 = dVar.f2465e;
        rectF.set(f6, dVar.f2462b, dVar.f2463c, dVar.f2464d);
        if (jVar.f2671c == null) {
            jVar.f2671c = new float[8];
        }
        float[] fArr = jVar.f2671c;
        q6.i.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        Path path = jVar.f2669a;
        RectF rectF2 = jVar.f2670b;
        q6.i.b(rectF2);
        float[] fArr2 = jVar.f2671c;
        q6.i.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final e1.c b() {
        if (this.f2670b == null) {
            this.f2670b = new RectF();
        }
        RectF rectF = this.f2670b;
        q6.i.b(rectF);
        this.f2669a.computeBounds(rectF, true);
        return new e1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean c(j jVar, j jVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = jVar.f2669a;
        if (jVar2 instanceof j) {
            return this.f2669a.op(path, jVar2.f2669a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.f2669a.reset();
    }
}
