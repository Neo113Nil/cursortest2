package O0;

import com.visualfortune.eyerest.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final List f637a;

    static {
        b bVar = b.f605a;
        b bVar2 = b.f606b;
        b bVar3 = b.f607c;
        i iVar = new i(1, R.string.routine_quick_name, R.string.routine_quick_desc, 120, 15000L, 0.55f, R0.i.l0(bVar, bVar2, bVar3));
        b bVar4 = b.d;
        f637a = R0.i.l0(iVar, new i(2, R.string.routine_standard_name, R.string.routine_standard_desc, 180, 20000L, 0.75f, R0.i.l0(bVar, bVar2, bVar3, bVar4)), new i(3, R.string.routine_full_name, R.string.routine_full_desc, 300, 25000L, 0.95f, R0.i.l0(bVar, bVar2, bVar3, bVar4)));
    }
}
