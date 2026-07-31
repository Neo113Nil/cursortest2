package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ComposableLambda.kt */
@Stable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0018J6\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001aJ@\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001cJJ\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001eJT\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010 J^\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\"Jh\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010$Jr\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010&J|\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020/\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "trackWrite", "()V", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "(Landroidx/compose/runtime/Composer;)V", "update", "(Ljava/lang/Object;)V", "c", "changed", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p1", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p5", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p7", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p8", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p9", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "I", "getKey", "()I", "Z", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableLambdaImpl implements ComposableLambda {
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List scopes;
    private final boolean tracked;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Composer) obj, ((Number) obj2).intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return invoke(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, (Composer) obj7, ((Number) obj8).intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, (Composer) obj8, ((Number) obj9).intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (Composer) obj9, ((Number) obj10).intValue());
    }

    @Override // kotlin.jvm.functions.Function11
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (Composer) obj10, ((Number) obj11).intValue());
    }

    public ComposableLambdaImpl(int i, boolean z, Object obj) {
        this.key = i;
        this.tracked = z;
        this._block = obj;
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((RecomposeScope) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.replacableWith((RecomposeScope) list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    public final void update(Object block) {
        if (Intrinsics.areEqual(this._block, block)) {
            return;
        }
        boolean z = this._block == null;
        this._block = block;
        if (z) {
            return;
        }
        trackWrite();
    }

    public Object invoke(Composer c, int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = changed | (startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0));
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2)).invoke(startRestartGroup, Integer.valueOf(differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$1(this));
        }
        return invoke;
    }

    public Object invoke(final Object p1, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 3)).invoke(p1, startRestartGroup, Integer.valueOf(differentBits | changed));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableLambdaImpl.invoke$lambda$0(ComposableLambdaImpl.this, p1, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$0;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(ComposableLambdaImpl composableLambdaImpl, Object obj, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function4) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 4)).invoke(p1, p2, startRestartGroup, Integer.valueOf(differentBits | changed));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = ComposableLambdaImpl.invoke$lambda$1(ComposableLambdaImpl.this, p1, p2, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$1;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function5) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 5)).invoke(p1, p2, p3, startRestartGroup, Integer.valueOf(differentBits | changed));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$2;
                    invoke$lambda$2 = ComposableLambdaImpl.invoke$lambda$2(ComposableLambdaImpl.this, p1, p2, p3, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$2;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function6) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 6)).invoke(p1, p2, p3, p4, startRestartGroup, Integer.valueOf(differentBits | changed));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$3;
                    invoke$lambda$3 = ComposableLambdaImpl.invoke$lambda$3(ComposableLambdaImpl.this, p1, p2, p3, p4, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$3;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function7) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 7)).invoke(p1, p2, p3, p4, p5, startRestartGroup, Integer.valueOf(changed | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$4;
                    invoke$lambda$4 = ComposableLambdaImpl.invoke$lambda$4(ComposableLambdaImpl.this, p1, p2, p3, p4, p5, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$4;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function8) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 8)).invoke(p1, p2, p3, p4, p5, p6, startRestartGroup, Integer.valueOf(changed | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$5;
                    invoke$lambda$5 = ComposableLambdaImpl.invoke$lambda$5(ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$5;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function9) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 9)).invoke(p1, p2, p3, p4, p5, p6, p7, startRestartGroup, Integer.valueOf(changed | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$6;
                    invoke$lambda$6 = ComposableLambdaImpl.invoke$lambda$6(ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$6;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function10) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 10)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, startRestartGroup, Integer.valueOf(changed | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$7;
                    invoke$lambda$7 = ComposableLambdaImpl.invoke$lambda$7(ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$7;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, Composer c, final int changed) {
        Composer startRestartGroup = c.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object obj = this._block;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function11) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 11)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, startRestartGroup, Integer.valueOf(changed | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invoke$lambda$8;
                    invoke$lambda$8 = ComposableLambdaImpl.invoke$lambda$8(ComposableLambdaImpl.this, p1, p2, p3, p4, p5, p6, p7, p8, p9, changed, (Composer) obj2, ((Integer) obj3).intValue());
                    return invoke$lambda$8;
                }
            });
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, Composer composer, int i2) {
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, RecomposeScopeImplKt.updateChangedFlags(i) | 1);
        return Unit.INSTANCE;
    }
}
