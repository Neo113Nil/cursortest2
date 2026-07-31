package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionLocals.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0014\"&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014\"&\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0012\u0012\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u0014\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000f8\u0006¢\u0006\f\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u0010\u0014\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014\"\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u0014\"\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u0010\u0014\"\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u0010\u0014\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010\u0012\u001a\u0004\b>\u0010\u0014\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\bA\u0010\u0014\"\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bD\u0010\u0014\"\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010\u0014¨\u0006H"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "name", "", "noLocalProvidedFor", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/autofill/Autofill;", "LocalAutofill", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "Landroidx/compose/ui/autofill/AutofillTree;", "LocalAutofillTree", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "Landroidx/compose/ui/platform/ClipboardManager;", "LocalClipboardManager", "getLocalClipboardManager", "Landroidx/compose/ui/unit/Density;", "LocalDensity", "getLocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "LocalFocusManager", "getLocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "LocalFontLoader", "getLocalFontLoader", "getLocalFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "LocalFontFamilyResolver", "getLocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "LocalHapticFeedback", "getLocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "LocalInputModeManager", "getLocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "LocalLayoutDirection", "getLocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "LocalTextInputService", "getLocalTextInputService", "Landroidx/compose/ui/platform/TextToolbar;", "LocalTextToolbar", "getLocalTextToolbar", "LocalUriHandler", "getLocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "LocalViewConfiguration", "getLocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "LocalWindowInfo", "getLocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "LocalPointerIconService", "getLocalPointerIconService", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final AccessibilityManager mo4828invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final Autofill mo4828invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final AutofillTree mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ClipboardManager mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalDensity = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Density mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final FocusManager mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Font.ResourceLoader mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final FontFamily.Resolver mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final HapticFeedback mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final InputModeManager mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final LayoutDirection mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final TextInputService mo4828invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final TextToolbar mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final UriHandler mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final ViewConfiguration mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final WindowInfo mo4828invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final PointerIconService mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final ProvidableCompositionLocal getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    public static final ProvidableCompositionLocal getLocalDensity() {
        return LocalDensity;
    }

    public static final ProvidableCompositionLocal getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final ProvidableCompositionLocal getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final ProvidableCompositionLocal getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final ProvidableCompositionLocal getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final ProvidableCompositionLocal getLocalTextInputService() {
        return LocalTextInputService;
    }

    public static final ProvidableCompositionLocal getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    public static final ProvidableCompositionLocal getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final void ProvideCommonCompositionLocals(final Owner owner, final UriHandler uriHandler, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(owner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(uriHandler) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusManager()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, content, startRestartGroup, ((i2 >> 3) & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                CompositionLocalsKt.ProvideCommonCompositionLocals(Owner.this, uriHandler, content, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
