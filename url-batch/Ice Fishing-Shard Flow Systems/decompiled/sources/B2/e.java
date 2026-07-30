package B2;

import A6.y;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface e {
    List<String> enabledFeatureKeys();

    boolean isEnabled(b bVar);

    Map<String, y> remoteFeatureFlagMetadata();
}
