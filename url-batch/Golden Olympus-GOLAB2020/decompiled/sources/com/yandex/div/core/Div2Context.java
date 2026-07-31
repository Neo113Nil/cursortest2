package com.yandex.div.core;

import W1.h;
import W1.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.AbstractC1321v;
import androidx.lifecycle.InterfaceC1354u;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$style;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class Div2Context extends ContextWrapper {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int RESET_ERROR_COLLECTORS = 2;
    public static final int RESET_EXPRESSION_RUNTIMES = 1;
    private static final int RESET_NONE = 0;
    public static final int RESET_SELECTED_STATES = 4;
    public static final int RESET_VISIBILITY_COUNTERS = 8;

    @NotNull
    private final ContextThemeWrapper baseContext;

    @NotNull
    private final Div2Component div2Component;

    @NotNull
    private final h globalVariableController$delegate;

    @Nullable
    private LayoutInflater inflater;

    @Nullable
    private final InterfaceC1354u lifecycleOwner;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class Div2InflaterFactory implements LayoutInflater.Factory2 {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Div2Context div2Context;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Div2InflaterFactory(@NotNull Div2Context div2Context) {
            Intrinsics.checkNotNullParameter(div2Context, "div2Context");
            this.div2Context = div2Context;
        }

        private final boolean isDiv2View(String str) {
            return Intrinsics.areEqual("com.yandex.div.core.view2.Div2View", str) || Intrinsics.areEqual("Div2View", str);
        }

        @Override // android.view.LayoutInflater.Factory2
        @Nullable
        public View onCreateView(@Nullable View view, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            return onCreateView(name, context, attrs);
        }

        @Override // android.view.LayoutInflater.Factory
        @Nullable
        public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            if (!isDiv2View(name)) {
                return null;
            }
            return new Div2View(this.div2Context, attrs, 0, 4, null);
        }
    }

    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, InterfaceC1354u interfaceC1354u) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = interfaceC1354u;
        this.globalVariableController$delegate = i.b(new Div2Context$globalVariableController$2(this));
        getDiv2Component$div_release().getDivCreationTracker().onContextCreationFinished();
    }

    public static /* synthetic */ void getGlobalVariableController$annotations() {
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.inflater;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.inflater;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.baseContext).cloneInContext(this);
                Intrinsics.checkNotNull(layoutInflater, "null cannot be cast to non-null type android.view.LayoutInflater");
                AbstractC1321v.a(layoutInflater, new Div2InflaterFactory(this));
                this.inflater = layoutInflater;
            }
        }
        return layoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reset$default(Div2Context div2Context, int i4, List list, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        div2Context.reset(i4, list);
    }

    public boolean cancelTooltips() {
        return getDiv2Component$div_release().getTooltipController().cancelAllTooltips();
    }

    @NotNull
    public Div2Context childContext(@NotNull ContextThemeWrapper baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        return new Div2Context(baseContext, getDiv2Component$div_release(), getLifecycleOwner$div_release());
    }

    @NotNull
    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    @NotNull
    public DivVariableController getDivVariableController() {
        DivVariableController divVariableController = getDiv2Component$div_release().getDivVariableController();
        Intrinsics.checkNotNullExpressionValue(divVariableController, "div2Component.divVariableController");
        return divVariableController;
    }

    @NotNull
    public GlobalVariableController getGlobalVariableController() {
        return (GlobalVariableController) this.globalVariableController$delegate.getValue();
    }

    @Nullable
    public InterfaceC1354u getLifecycleOwner$div_release() {
        return this.lifecycleOwner;
    }

    @NotNull
    public PerformanceDependentSessionProfiler getPerformanceDependentSessionProfiler() {
        PerformanceDependentSessionProfiler performanceDependentSessionProfiler = getDiv2Component$div_release().getPerformanceDependentSessionProfiler();
        Intrinsics.checkNotNullExpressionValue(performanceDependentSessionProfiler, "div2Component.performanceDependentSessionProfiler");
        return performanceDependentSessionProfiler;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Nullable
    public Object getSystemService(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual("layout_inflater", name) ? getLayoutInflater() : this.baseContext.getSystemService(name);
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return getDiv2Component$div_release().getDivViewCreator().getViewPreCreationProfile();
    }

    @NotNull
    public ViewPreCreationProfileRepository getViewPreCreationProfileRepository() {
        ViewPreCreationProfileRepository viewPreCreationProfileRepository = getDiv2Component$div_release().getViewPreCreationProfileRepository();
        Intrinsics.checkNotNullExpressionValue(viewPreCreationProfileRepository, "div2Component.viewPreCreationProfileRepository");
        return viewPreCreationProfileRepository;
    }

    public void reset(int i4, @NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if ((i4 & 1) != 0) {
            getDiv2Component$div_release().getRuntimeStoreProvider().reset(tags);
        }
        if ((i4 & 2) != 0) {
            getDiv2Component$div_release().getErrorCollectors().reset(tags);
        }
        if ((i4 & 4) != 0) {
            getDiv2Component$div_release().getStateManager().reset(tags);
        }
        if ((i4 & 8) != 0) {
            getDiv2Component$div_release().getVisibilityActionDispatcher().reset(tags);
        }
    }

    public void setViewPreCreationProfile(@NotNull ViewPreCreationProfile value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDiv2Component$div_release().getDivViewCreator().setViewPreCreationProfile(value);
    }

    public void warmUp() {
        getDiv2Component$div_release().getDiv2Builder();
    }

    @NotNull
    public Div2Context childContext(@Nullable InterfaceC1354u interfaceC1354u) {
        return new Div2Context(this.baseContext, getDiv2Component$div_release(), interfaceC1354u);
    }

    @NotNull
    public Div2Context childContext(@NotNull ContextThemeWrapper baseContext, @Nullable InterfaceC1354u interfaceC1354u) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        return new Div2Context(baseContext, getDiv2Component$div_release(), interfaceC1354u);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i4, InterfaceC1354u interfaceC1354u, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, divConfiguration, (i5 & 4) != 0 ? R$style.Div_Theme : i4, (i5 & 8) != 0 ? null : interfaceC1354u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Div2Context(@NotNull ContextThemeWrapper baseContext, @NotNull DivConfiguration configuration, int i4, @Nullable InterfaceC1354u interfaceC1354u) {
        this(baseContext, r5, interfaceC1354u);
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Div2Component build = DivKit.Companion.getInstance(baseContext).getComponent$div_release().div2Component().baseContext(baseContext).configuration(configuration).themeId(i4).divCreationTracker(new DivCreationTracker(SystemClock.uptimeMillis())).divVariableController(configuration.getDivVariableController()).build();
        Intrinsics.checkNotNullExpressionValue(build, "DivKit.getInstance(baseC…ler)\n            .build()");
    }
}
