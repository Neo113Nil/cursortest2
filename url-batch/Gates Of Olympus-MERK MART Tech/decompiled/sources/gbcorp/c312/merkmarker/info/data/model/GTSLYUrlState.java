package gbcorp.c312.merkmarker.info.data.model;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GTSLYUrlState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "", "<init>", "()V", "Present", "Loading", "NoUrl", "Denied", "Companion", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Denied;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Loading;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$NoUrl;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Present;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GTSLYUrlState {
    public static final int $stable = 0;
    public static final String ACCESS_DENIED_URL_VALUE = "access_denied";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ GTSLYUrlState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GTSLYUrlState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Present;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Present extends GTSLYUrlState {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ Present copy$default(Present present, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = present.url;
            }
            return present.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Present copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Present(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Present) && Intrinsics.areEqual(this.url, ((Present) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "Present(url=" + this.url + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Present(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    private GTSLYUrlState() {
    }

    /* compiled from: GTSLYUrlState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Loading;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends GTSLYUrlState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GTSLYUrlState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$NoUrl;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoUrl extends GTSLYUrlState {
        public static final int $stable = 0;
        public static final NoUrl INSTANCE = new NoUrl();

        private NoUrl() {
            super(null);
        }
    }

    /* compiled from: GTSLYUrlState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Denied;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Denied extends GTSLYUrlState {
        public static final int $stable = 0;
        public static final Denied INSTANCE = new Denied();

        private Denied() {
            super(null);
        }
    }

    /* compiled from: GTSLYUrlState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState$Companion;", "", "<init>", "()V", "ACCESS_DENIED_URL_VALUE", "", "urlStateFromValue", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", ImagesContract.URL, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GTSLYUrlState urlStateFromValue(String url) {
            if (url == null) {
                return NoUrl.INSTANCE;
            }
            return Intrinsics.areEqual(url, GTSLYUrlState.ACCESS_DENIED_URL_VALUE) ? Denied.INSTANCE : new Present(url);
        }
    }
}
