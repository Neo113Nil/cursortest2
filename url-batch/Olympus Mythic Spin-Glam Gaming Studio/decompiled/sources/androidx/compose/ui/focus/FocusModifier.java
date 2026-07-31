package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.input.focus.FocusAwareInputModifier;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusModifier.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 v2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001vB%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R*\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0011R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010j\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010h8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020h0!8\u0006¢\u0006\f\n\u0004\bn\u0010#\u001a\u0004\bo\u0010%R\u0014\u0010p\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010eR\u001c\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010&\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001e¨\u0006w"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/focus/FocusStateImpl;", "initialFocus", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/ui/focus/FocusStateImpl;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "", "propagateRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parent", "Landroidx/compose/ui/focus/FocusModifier;", "getParent", "()Landroidx/compose/ui/focus/FocusModifier;", "setParent", "(Landroidx/compose/ui/focus/FocusModifier;)V", "Landroidx/compose/runtime/collection/MutableVector;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "value", "focusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "setFocusedChild", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "focusEventListener", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "getFocusEventListener", "()Landroidx/compose/ui/focus/FocusEventModifierLocal;", "setFocusEventListener", "(Landroidx/compose/ui/focus/FocusEventModifierLocal;)V", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "rotaryScrollParent", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "getRotaryScrollParent$annotations", "()V", "modifierLocalReadScope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "getModifierLocalReadScope", "()Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "setModifierLocalReadScope", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "setBeyondBoundsLayoutParent", "(Landroidx/compose/ui/layout/BeyondBoundsLayout;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "focusPropertiesModifier", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "getFocusPropertiesModifier", "()Landroidx/compose/ui/focus/FocusPropertiesModifier;", "setFocusPropertiesModifier", "(Landroidx/compose/ui/focus/FocusPropertiesModifier;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "getFocusProperties", "()Landroidx/compose/ui/focus/FocusProperties;", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequesterModifierLocal;)V", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getLayoutNodeWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setLayoutNodeWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "focusRequestedOnPlaced", "Z", "getFocusRequestedOnPlaced", "()Z", "setFocusRequestedOnPlaced", "(Z)V", "Landroidx/compose/ui/input/key/KeyInputModifier;", "<set-?>", "keyInputModifier", "Landroidx/compose/ui/input/key/KeyInputModifier;", "getKeyInputModifier", "()Landroidx/compose/ui/input/key/KeyInputModifier;", "keyInputChildren", "getKeyInputChildren", "isValid", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FocusModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<FocusModifier>, OwnerScope, OnPlacedModifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1 RefreshFocusProperties = new Function1() { // from class: androidx.compose.ui.focus.FocusModifier$Companion$RefreshFocusProperties$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusModifier) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FocusModifier focusModifier) {
            Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
            FocusPropertiesKt.refreshFocusProperties(focusModifier);
        }
    };
    private BeyondBoundsLayout beyondBoundsLayoutParent;
    private final MutableVector children;
    private FocusEventModifierLocal focusEventListener;
    private final FocusProperties focusProperties;
    private FocusPropertiesModifier focusPropertiesModifier;
    private boolean focusRequestedOnPlaced;
    private FocusRequesterModifierLocal focusRequester;
    private FocusStateImpl focusState;
    private FocusModifier focusedChild;
    private final MutableVector keyInputChildren;
    private KeyInputModifier keyInputModifier;
    private LayoutNodeWrapper layoutNodeWrapper;
    public ModifierLocalReadScope modifierLocalReadScope;
    private FocusModifier parent;
    private FocusAwareInputModifier rotaryScrollParent;

    /* compiled from: FocusModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusModifier getValue() {
        return this;
    }

    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(focusStateImpl, (i & 2) != 0 ? InspectableValueKt.getNoInspectorInfo() : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifier(FocusStateImpl initialFocus, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(initialFocus, "initialFocus");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.children = new MutableVector(new FocusModifier[16], 0);
        this.focusState = initialFocus;
        this.focusProperties = new FocusPropertiesImpl();
        this.keyInputChildren = new MutableVector(new KeyInputModifier[16], 0);
    }

    public final FocusModifier getParent() {
        return this.parent;
    }

    public final MutableVector getChildren() {
        return this.children;
    }

    public final FocusStateImpl getFocusState() {
        return this.focusState;
    }

    public final void setFocusState(FocusStateImpl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.focusState = value;
        FocusTransactionsKt.sendOnFocusEvent(this);
    }

    public final FocusModifier getFocusedChild() {
        return this.focusedChild;
    }

    public final void setFocusedChild(FocusModifier focusModifier) {
        this.focusedChild = focusModifier;
    }

    public final FocusEventModifierLocal getFocusEventListener() {
        return this.focusEventListener;
    }

    public final void setModifierLocalReadScope(ModifierLocalReadScope modifierLocalReadScope) {
        Intrinsics.checkNotNullParameter(modifierLocalReadScope, "<set-?>");
        this.modifierLocalReadScope = modifierLocalReadScope;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return this.beyondBoundsLayoutParent;
    }

    public final FocusPropertiesModifier getFocusPropertiesModifier() {
        return this.focusPropertiesModifier;
    }

    public final FocusProperties getFocusProperties() {
        return this.focusProperties;
    }

    public final LayoutNodeWrapper getLayoutNodeWrapper() {
        return this.layoutNodeWrapper;
    }

    public final void setFocusRequestedOnPlaced(boolean z) {
        this.focusRequestedOnPlaced = z;
    }

    public final KeyInputModifier getKeyInputModifier() {
        return this.keyInputModifier;
    }

    public final MutableVector getKeyInputChildren() {
        return this.keyInputChildren;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        MutableVector mutableVector;
        MutableVector mutableVector2;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode;
        Owner owner;
        FocusManager focusManager;
        Intrinsics.checkNotNullParameter(scope, "scope");
        setModifierLocalReadScope(scope);
        FocusModifier focusModifier = (FocusModifier) scope.getCurrent(FocusModifierKt.getModifierLocalParentFocusModifier());
        if (!Intrinsics.areEqual(focusModifier, this.parent)) {
            if (focusModifier == null) {
                int i = WhenMappings.$EnumSwitchMapping$0[this.focusState.ordinal()];
                if ((i == 1 || i == 2) && (layoutNodeWrapper = this.layoutNodeWrapper) != null && (layoutNode = layoutNodeWrapper.getLayoutNode()) != null && (owner = layoutNode.getOwner()) != null && (focusManager = owner.getFocusManager()) != null) {
                    focusManager.clearFocus(true);
                }
            }
            FocusModifier focusModifier2 = this.parent;
            if (focusModifier2 != null && (mutableVector2 = focusModifier2.children) != null) {
                mutableVector2.remove(this);
            }
            if (focusModifier != null && (mutableVector = focusModifier.children) != null) {
                mutableVector.add(this);
            }
        }
        this.parent = focusModifier;
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) scope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
        if (!Intrinsics.areEqual(focusEventModifierLocal, this.focusEventListener)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.focusEventListener;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.removeFocusModifier(this);
            }
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.addFocusModifier(this);
            }
        }
        this.focusEventListener = focusEventModifierLocal;
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) scope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (!Intrinsics.areEqual(focusRequesterModifierLocal, this.focusRequester)) {
            FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.focusRequester;
            if (focusRequesterModifierLocal2 != null) {
                focusRequesterModifierLocal2.removeFocusModifier(this);
            }
            if (focusRequesterModifierLocal != null) {
                focusRequesterModifierLocal.addFocusModifier(this);
            }
        }
        this.focusRequester = focusRequesterModifierLocal;
        this.rotaryScrollParent = (FocusAwareInputModifier) scope.getCurrent(RotaryInputModifierKt.getModifierLocalRotaryScrollParent());
        this.beyondBoundsLayoutParent = (BeyondBoundsLayout) scope.getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
        this.keyInputModifier = (KeyInputModifier) scope.getCurrent(KeyInputModifierKt.getModifierLocalKeyInput());
        this.focusPropertiesModifier = (FocusPropertiesModifier) scope.getCurrent(FocusPropertiesKt.getModifierLocalFocusProperties());
        FocusPropertiesKt.refreshFocusProperties(this);
    }

    public final boolean propagateRotaryEvent(RotaryScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        FocusAwareInputModifier focusAwareInputModifier = this.rotaryScrollParent;
        if (focusAwareInputModifier != null) {
            return focusAwareInputModifier.propagateFocusAwareEvent(event);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.parent != null;
    }

    /* compiled from: FocusModifier.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier$Companion;", "", "()V", "RefreshFocusProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "", "getRefreshFocusProperties", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1 getRefreshFocusProperties() {
            return FocusModifier.RefreshFocusProperties;
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return FocusModifierKt.getModifierLocalParentFocusModifier();
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        boolean z = this.layoutNodeWrapper == null;
        this.layoutNodeWrapper = (LayoutNodeWrapper) coordinates;
        if (z) {
            FocusPropertiesKt.refreshFocusProperties(this);
        }
        if (this.focusRequestedOnPlaced) {
            this.focusRequestedOnPlaced = false;
            FocusTransactionsKt.requestFocus(this);
        }
    }
}
