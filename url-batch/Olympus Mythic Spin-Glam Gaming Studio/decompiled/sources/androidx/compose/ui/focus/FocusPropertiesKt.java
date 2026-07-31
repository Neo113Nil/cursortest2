package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "scope", "focusProperties", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusModifier;", "properties", "setUpdatedProperties", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusProperties;)V", "clear", "(Landroidx/compose/ui/focus/FocusProperties;)V", "refreshFocusProperties", "(Landroidx/compose/ui/focus/FocusModifier;)V", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "ModifierLocalFocusProperties", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusProperties", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FocusPropertiesKt {
    private static final ProvidableModifierLocal ModifierLocalFocusProperties = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$ModifierLocalFocusProperties$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final FocusPropertiesModifier mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalFocusProperties() {
        return ModifierLocalFocusProperties;
    }

    public static final Modifier focusProperties(Modifier modifier, final Function1 scope) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return modifier.then(new FocusPropertiesModifier(scope, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$focusProperties$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusProperties");
                inspectorInfo.getProperties().set("scope", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final void setUpdatedProperties(FocusModifier focusModifier, FocusProperties properties) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (properties.getCanFocus()) {
            FocusTransactionsKt.activateNode(focusModifier);
        } else {
            FocusTransactionsKt.deactivateNode(focusModifier);
        }
    }

    public static final void clear(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "<this>");
        focusProperties.setCanFocus(true);
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        focusProperties.setNext(companion.getDefault());
        focusProperties.setPrevious(companion.getDefault());
        focusProperties.setUp(companion.getDefault());
        focusProperties.setDown(companion.getDefault());
        focusProperties.setLeft(companion.getDefault());
        focusProperties.setRight(companion.getDefault());
        focusProperties.setStart(companion.getDefault());
        focusProperties.setEnd(companion.getDefault());
    }

    public static final void refreshFocusProperties(final FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper == null) {
            return;
        }
        clear(focusModifier.getFocusProperties());
        Owner owner = layoutNodeWrapper.getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(focusModifier, FocusModifier.INSTANCE.getRefreshFocusProperties(), new Function0() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$refreshFocusProperties$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m1265invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1265invoke() {
                    FocusPropertiesModifier focusPropertiesModifier = FocusModifier.this.getFocusPropertiesModifier();
                    if (focusPropertiesModifier != null) {
                        focusPropertiesModifier.calculateProperties(FocusModifier.this.getFocusProperties());
                    }
                }
            });
        }
        setUpdatedProperties(focusModifier, focusModifier.getFocusProperties());
    }
}
