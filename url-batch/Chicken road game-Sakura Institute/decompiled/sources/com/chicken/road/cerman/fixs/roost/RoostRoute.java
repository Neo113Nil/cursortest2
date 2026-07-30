package com.chicken.road.cerman.fixs.roost;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoostRoute.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", "", "Pending", "Home", "Page", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Home;", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Page;", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Pending;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RoostRoute {

    /* compiled from: RoostRoute.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Pending;", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pending implements RoostRoute {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pending)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1299248370;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }

    /* compiled from: RoostRoute.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Home;", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Home implements RoostRoute {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Home)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1535394104;
        }

        public String toString() {
            return "Home";
        }

        private Home() {
        }
    }

    /* compiled from: RoostRoute.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Page;", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", ImagesContract.URL, "", "consent", "", "<init>", "(Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getConsent", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Page implements RoostRoute {
        public static final int $stable = 0;
        private final boolean consent;
        private final String url;

        public static /* synthetic */ Page copy$default(Page page, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = page.url;
            }
            if ((i & 2) != 0) {
                z = page.consent;
            }
            return page.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getConsent() {
            return this.consent;
        }

        public final Page copy(String url, boolean consent) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Page(url, consent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return Intrinsics.areEqual(this.url, page.url) && this.consent == page.consent;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + Boolean.hashCode(this.consent);
        }

        public String toString() {
            return "Page(url=" + this.url + ", consent=" + this.consent + ")";
        }

        public Page(String url, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.consent = z;
        }

        public final boolean getConsent() {
            return this.consent;
        }

        public final String getUrl() {
            return this.url;
        }
    }
}
