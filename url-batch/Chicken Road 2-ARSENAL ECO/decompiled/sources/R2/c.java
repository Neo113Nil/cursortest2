package R2;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;
    private final String id;
    private final String message;
    private final String title;

    public c(int i7, String id, String fullData, long j4, String str, String str2) {
        i.e(id, "id");
        i.e(fullData, "fullData");
        this.androidId = i7;
        this.id = id;
        this.fullData = fullData;
        this.createdAt = j4;
        this.title = str;
        this.message = str2;
    }

    public final int getAndroidId() {
        return this.androidId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}
