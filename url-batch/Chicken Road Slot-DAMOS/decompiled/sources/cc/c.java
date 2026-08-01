package cc;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;

    /* renamed from: id, reason: collision with root package name */
    private final String f2036id;
    private final String message;
    private final String title;

    public c(int i3, String str, String str2, long j, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.androidId = i3;
        this.f2036id = str;
        this.fullData = str2;
        this.createdAt = j;
        this.title = str3;
        this.message = str4;
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
        return this.f2036id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}
