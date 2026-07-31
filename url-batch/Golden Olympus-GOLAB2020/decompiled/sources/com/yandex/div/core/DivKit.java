package com.yandex.div.core;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivKit {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final DivKitConfiguration DEFAULT_CONFIGURATION = new DivKitConfiguration.Builder().build();

    @Nullable
    private static DivKitConfiguration configuration;

    @Nullable
    private static volatile DivKit instance;

    @NotNull
    private final DivKitComponent component;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DivKit getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DivKit divKit = DivKit.instance;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                try {
                    DivKit divKit2 = DivKit.instance;
                    if (divKit2 != null) {
                        return divKit2;
                    }
                    DivKitConfiguration divKitConfiguration = DivKit.configuration;
                    if (divKitConfiguration == null) {
                        divKitConfiguration = DivKit.DEFAULT_CONFIGURATION;
                    }
                    DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                    DivKit.instance = divKit3;
                    return divKit3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @NotNull
        public final String getVersionName() {
            return "32.5.0";
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, divKitConfiguration);
    }

    @NotNull
    public final DivKitComponent getComponent$div_release() {
        return this.component;
    }

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        DivKitComponent.Builder builder = Yatagan$DivKitComponent.builder();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.component = builder.applicationContext(applicationContext).configuration(divKitConfiguration).build();
    }
}
