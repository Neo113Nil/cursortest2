package kotlin.reflect.jvm.internal;

import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes5.dex */
public final class ReflectionObjectRenderer$$Lambda$4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final boolean arg$0;

    public /* synthetic */ ReflectionObjectRenderer$$Lambda$4(boolean z, int i) {
        this.$r8$classId = i;
        this.arg$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                kTypeProjection.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(this.arg$0 ? "(raw) " : "");
                sb.append(kTypeProjection);
                return sb.toString();
            default:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                registerAliasViewModel.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel, null, null, null, false, this.arg$0, false, null, false, false, 1048319);
        }
    }
}
