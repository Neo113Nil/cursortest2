package androidx.compose.ui.semantics;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "", "id", "", "mergeDescendants", "clearAndSetSemantics", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "properties", "<init>", "(IZZLkotlin/jvm/functions/Function1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getId", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SemanticsModifierCore implements SemanticsModifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);
    private final int id;
    private final SemanticsConfiguration semanticsConfiguration;

    public SemanticsModifierCore(int i, boolean z, boolean z2, Function1 properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.id = i;
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(z);
        semanticsConfiguration.setClearingSemantics(z2);
        properties.invoke(semanticsConfiguration);
        this.semanticsConfiguration = semanticsConfiguration;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }

    /* compiled from: SemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore$Companion;", "", "()V", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "generateSemanticsId", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int generateSemanticsId() {
            return SemanticsModifierCore.lastIdentifier.addAndGet(1);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsModifierCore)) {
            return false;
        }
        SemanticsModifierCore semanticsModifierCore = (SemanticsModifierCore) other;
        return getId() == semanticsModifierCore.getId() && Intrinsics.areEqual(getSemanticsConfiguration(), semanticsModifierCore.getSemanticsConfiguration());
    }

    public int hashCode() {
        return (getSemanticsConfiguration().hashCode() * 31) + Integer.hashCode(getId());
    }
}
