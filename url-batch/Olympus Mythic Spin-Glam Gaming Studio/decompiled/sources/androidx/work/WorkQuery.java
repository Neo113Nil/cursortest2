package androidx.work;

import java.util.List;

/* loaded from: classes12.dex */
public final class WorkQuery {
    private final List mIds;
    private final List mStates;
    private final List mTags;
    private final List mUniqueWorkNames;

    public static final class Builder {
    }

    public List getIds() {
        return this.mIds;
    }

    public List getUniqueWorkNames() {
        return this.mUniqueWorkNames;
    }

    public List getTags() {
        return this.mTags;
    }

    public List getStates() {
        return this.mStates;
    }
}
