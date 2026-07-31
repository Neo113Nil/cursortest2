package Z1;

import U5.x;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface e {
    List<String> enabledFeatureKeys();

    boolean isEnabled(b bVar);

    Map<String, x> remoteFeatureFlagMetadata();
}
