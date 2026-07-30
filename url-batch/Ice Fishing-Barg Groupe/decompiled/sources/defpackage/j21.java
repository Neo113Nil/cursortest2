package defpackage;

import androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate;
import com.ice.fishing.grenza.presentation.navigation.MenuRoute;
import com.ice.fishing.grenza.presentation.navigation.RatedRoute;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class j21 implements ae0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ j21(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 1:
                t92 t92Var = a51.PxuCJdSBwIXG;
                return Boolean.FALSE;
            case 2:
                d71.Companion.getClass();
                return c71.PxuCJdSBwIXG;
            case 3:
                return new re1("com.ice.fishing.grenza.presentation.navigation.MenuRoute", MenuRoute.INSTANCE, new Annotation[0]);
            case 4:
                return new rz1();
            case 5:
                zo0 zo0Var = new zo0(0);
                zo0Var.PxuCJdSBwIXG(bu1.PxuCJdSBwIXG(y91.class), new xy0(9));
                return zo0Var.TSizfFm2Yiuu();
            case 6:
                return new zh1();
            case 7:
                yw ywVar = j00.PxuCJdSBwIXG;
                return qw.wdg6QnbFHrFF;
            case 8:
                return new re1("com.ice.fishing.grenza.presentation.navigation.RatedRoute", RatedRoute.INSTANCE, new Annotation[0]);
            case 9:
                return new ow1();
            case 10:
                return new yy1(new LinkedHashMap());
            case 11:
                t92 t92Var2 = bz1.PxuCJdSBwIXG;
                return null;
            case 12:
                return new q02(0);
            case 13:
                fq fqVar = x22.PxuCJdSBwIXG;
                return null;
            case 14:
                throw new i42("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
            case 15:
                return new d52();
            case 16:
                SparseArraySerializer$SparseArraySurrogate.Companion companion = SparseArraySerializer$SparseArraySurrogate.Companion;
                return new ea(fr0.PxuCJdSBwIXG, 0);
            case 17:
                return new k10(0.0f);
            case 18:
                fq fqVar2 = bf2.PxuCJdSBwIXG;
                return null;
            case 19:
                return hn2.PxuCJdSBwIXG;
            case 20:
                return ix.PxuCJdSBwIXG;
            case 21:
                return Boolean.TRUE;
            default:
                return new en2(null, null, null, 32767);
        }
    }
}
