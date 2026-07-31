package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 z2\u00020\u0001:\u0001zJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H'¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ#\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H'¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010\bJ!\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0004H'¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ=\u00100\u001a\u00020\u0004\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010\"2\u0006\u0010\u0017\u001a\u00028\u00002\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040.H'¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b4\u00105J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u001d\u00106J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u00107J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u00108J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u000209H\u0017¢\u0006\u0004\b\u001d\u0010:J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020;H\u0017¢\u0006\u0004\b\u001d\u0010<J\u0019\u0010=\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b=\u00106J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H'¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040#H'¢\u0006\u0004\bG\u0010&J#\u0010I\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000HH'¢\u0006\u0004\bI\u0010JJ#\u0010N\u001a\u00020\u00042\u0012\u0010M\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030L0KH'¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0004H'¢\u0006\u0004\bP\u0010\bJ\u000f\u0010Q\u001a\u00020\u0004H&¢\u0006\u0004\bQ\u0010\bJ\u000f\u0010S\u001a\u00020RH'¢\u0006\u0004\bS\u0010TR\u001e\u0010Y\u001a\u0006\u0012\u0002\b\u00030U8&X§\u0004¢\u0006\f\u0012\u0004\bX\u0010\b\u001a\u0004\bV\u0010WR\u001a\u0010]\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\b\\\u0010\b\u001a\u0004\bZ\u0010[R\u001a\u0010`\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\b_\u0010\b\u001a\u0004\b^\u0010[R\u001a\u0010c\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bb\u0010\b\u001a\u0004\ba\u0010[R\u001c\u0010g\u001a\u0004\u0018\u00010>8&X§\u0004¢\u0006\f\u0012\u0004\bf\u0010\b\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bj\u0010\b\u001a\u0004\bh\u0010iR\u001e\u0010p\u001a\u00060;j\u0002`l8&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010\b\u001a\u0004\bm\u0010nR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8gX§\u0004¢\u0006\f\u0012\u0004\bx\u0010\b\u001a\u0004\bv\u0010w\u0082\u0001\u0001{ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006|À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "value", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "(Z)V", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "V", "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Composer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void apply(Object value, Function2 block);

    CompositionContext buildContext();

    boolean changed(Object value);

    void collectParameterInformation();

    Object consume(CompositionLocal key);

    void createNode(Function0 factory);

    void deactivateToEndGroup(boolean changed);

    void disableReusing();

    void enableReusing();

    void endDefaults();

    void endMovableGroup();

    void endNode();

    void endProviders();

    void endReplaceGroup();

    void endReplaceableGroup();

    ScopeUpdateScope endRestartGroup();

    void endReusableGroup();

    Applier getApplier();

    CoroutineContext getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    CompositionData getCompositionData();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    boolean getSkipping();

    void insertMovableContent(MovableContent value, Object parameter);

    void recordSideEffect(Function0 effect);

    void recordUsed(RecomposeScope scope);

    Object rememberedValue();

    boolean shouldExecute(boolean parametersChanged, int flags);

    void skipToGroupEnd();

    void startDefaults();

    void startMovableGroup(int key, Object dataKey);

    void startNode();

    void startProviders(ProvidedValue[] values);

    void startReplaceGroup(int key);

    void startReplaceableGroup(int key);

    Composer startRestartGroup(int key);

    void startReusableGroup(int key, Object dataKey);

    void startReusableNode();

    void updateRememberedValue(Object value);

    void useNode();

    default int getCompoundKeyHash() {
        return Long.hashCode(getCompositeKeyHashCode());
    }

    default boolean changed(boolean value) {
        return changed(value);
    }

    default boolean changed(int value) {
        return changed(value);
    }

    default boolean changed(float value) {
        return changed(value);
    }

    default boolean changed(long value) {
        return changed(value);
    }

    default boolean changedInstance(Object value) {
        return changed(value);
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }
    }
}
