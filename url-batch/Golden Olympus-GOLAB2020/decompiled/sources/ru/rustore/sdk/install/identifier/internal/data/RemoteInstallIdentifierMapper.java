package ru.rustore.sdk.install.identifier.internal.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ru.rustore.sdk.install.identifier.internal.domain.RemoteInstallIdentifier;
import ru.rustore.sdk.install.identifier.internal.domain.VersionCode;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifierMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String INSTALLATION_DATE_KEY = "installationDate";

    @Deprecated
    @NotNull
    public static final String INSTALLATION_ID_KEY = "installationId";

    @Deprecated
    @NotNull
    public static final String VERSION_CODE_KEY = "versionCode";

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Nullable
    public final RemoteInstallIdentifier mapToModel(@NotNull String data) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(data);
            String string = jSONObject.getString("installationId");
            Intrinsics.checkNotNullExpressionValue(string, "getString(INSTALLATION_ID_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new RemoteInstallIdentifier(string, new VersionCode(jSONObject.getLong("versionCode")), jSONObject.getLong("installationDate")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (RemoteInstallIdentifier) m243constructorimpl;
    }
}
