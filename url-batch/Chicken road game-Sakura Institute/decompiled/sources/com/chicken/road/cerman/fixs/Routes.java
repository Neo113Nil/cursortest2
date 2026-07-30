package com.chicken.road.cerman.fixs;

import kotlin.Metadata;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/chicken/road/cerman/fixs/Routes;", "", "<init>", "()V", "HUB", "", "FLOCK", "CHICKEN", "FEED", "EGGS", "HEALTH", "STATS", "chicken", "id", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Routes {
    public static final int $stable = 0;
    public static final String CHICKEN = "chicken/{id}";
    public static final String EGGS = "eggs";
    public static final String FEED = "feed";
    public static final String FLOCK = "flock";
    public static final String HEALTH = "health";
    public static final String HUB = "hub";
    public static final Routes INSTANCE = new Routes();
    public static final String STATS = "stats";

    private Routes() {
    }

    public final String chicken(long id) {
        return "chicken/" + id;
    }
}
