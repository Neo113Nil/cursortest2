package q5;

import kotlin.jvm.internal.h;

/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4931c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;
    private final String id;
    private final String message;
    private final String title;

    public C4931c(int i, String id, String fullData, long j9, String str, String str2) {
        h.e(id, "id");
        h.e(fullData, "fullData");
        this.androidId = i;
        this.id = id;
        this.fullData = fullData;
        this.createdAt = j9;
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
