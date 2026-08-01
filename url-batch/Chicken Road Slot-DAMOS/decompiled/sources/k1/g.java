package k1;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Path f5321a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f5322b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f5323c;

    public g(Path path) {
        this.f5321a = path;
    }

    public static void a(g gVar, g gVar2) {
        gVar.f5321a.addPath(gVar2.f5321a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(g gVar, j1.d dVar) {
        Path.Direction direction;
        b0 b0Var = b0.f5299d;
        if (gVar.f5322b == null) {
            gVar.f5322b = new RectF();
        }
        RectF rectF = gVar.f5322b;
        rectF.getClass();
        float f3 = dVar.f4920a;
        long j = dVar.f4926h;
        long j3 = dVar.g;
        long j10 = dVar.f4925f;
        long j11 = dVar.f4924e;
        rectF.set(f3, dVar.f4921b, dVar.f4922c, dVar.f4923d);
        if (gVar.f5323c == null) {
            gVar.f5323c = new float[8];
        }
        float[] fArr = gVar.f5323c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = gVar.f5321a;
        RectF rectF2 = gVar.f5322b;
        rectF2.getClass();
        float[] fArr2 = gVar.f5323c;
        fArr2.getClass();
        int ordinal = b0Var.ordinal();
        if (ordinal == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (ordinal != 1) {
                a2.r.p();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }
}
