package com.onesignal.core.internal.features;

import com.onesignal.core.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;

/* compiled from: FeatureManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/onesignal/core/internal/features/IFeatureManager;", "", "enabledFeatureKeys", "", "", "isEnabled", "", "feature", "Lcom/onesignal/core/internal/features/FeatureFlag;", "remoteFeatureFlagMetadata", "", "Lkotlinx/serialization/json/JsonObject;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IFeatureManager {
    List<String> enabledFeatureKeys();

    boolean isEnabled(FeatureFlag feature);

    Map<String, JsonObject> remoteFeatureFlagMetadata();
}
