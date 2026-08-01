package z5;

import a4.j;
import a6.g;
import android.os.Build;
import c6.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, int i3) {
        super(gVar);
        this.f10856f = i3;
    }

    @Override // z5.b
    public final boolean a(p pVar) {
        int i3 = this.f10856f;
        pVar.getClass();
        switch (i3) {
            case 0:
                return pVar.j.f9294b;
            case 1:
                return pVar.j.f9296d;
            case 2:
                return pVar.j.f9293a == 2;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                int i10 = pVar.j.f9293a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                return pVar.j.f9297e;
        }
    }

    @Override // z5.b
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f10856f) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                y5.a aVar = (y5.a) obj;
                aVar.getClass();
                int i3 = Build.VERSION.SDK_INT;
                boolean z10 = aVar.f10619a;
                return i3 < 26 ? !z10 : !(z10 && aVar.f10620b);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                y5.a aVar2 = (y5.a) obj;
                aVar2.getClass();
                return !aVar2.f10619a || aVar2.f10621c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
