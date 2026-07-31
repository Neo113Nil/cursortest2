package ru.rustore.sdk.install.identifier.internal.data;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class LocalInstallIdentifierDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String INSTALL_IDENTIFIER_VALUE_KEY = "INSTALL_IDENTIFIER_VALUE_KEY";

    @NotNull
    private final SharedPreferences sharedPreferences;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LocalInstallIdentifierDataSource(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Nullable
    public final String get() {
        return this.sharedPreferences.getString(INSTALL_IDENTIFIER_VALUE_KEY, null);
    }

    public final void set(@NotNull String identifierValue) {
        Intrinsics.checkNotNullParameter(identifierValue, "identifierValue");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(INSTALL_IDENTIFIER_VALUE_KEY, identifierValue);
        edit.apply();
    }
}
