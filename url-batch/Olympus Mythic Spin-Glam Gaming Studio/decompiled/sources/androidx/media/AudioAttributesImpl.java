package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo
/* loaded from: classes8.dex */
public interface AudioAttributesImpl extends VersionedParcelable {

    public interface Builder {
        AudioAttributesImpl build();

        Builder setUsage(int i);
    }
}
