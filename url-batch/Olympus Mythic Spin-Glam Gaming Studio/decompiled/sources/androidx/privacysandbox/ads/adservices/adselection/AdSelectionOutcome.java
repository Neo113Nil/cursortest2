package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdSelectionOutcome.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "", "", "adSelectionId", "Landroid/net/Uri;", "renderUri", "<init>", "(JLandroid/net/Uri;)V", "Landroid/adservices/adselection/AdSelectionOutcome;", "response", "(Landroid/adservices/adselection/AdSelectionOutcome;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getAdSelectionId", "()J", "Landroid/net/Uri;", "getRenderUri", "()Landroid/net/Uri;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes10.dex */
public final class AdSelectionOutcome {
    public static final AdSelectionOutcome NO_OUTCOME;
    private final long adSelectionId;
    private final Uri renderUri;

    public AdSelectionOutcome(long j, Uri renderUri) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        this.adSelectionId = j;
        this.renderUri = renderUri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) other;
        return this.adSelectionId == adSelectionOutcome.adSelectionId && Intrinsics.areEqual(this.renderUri, adSelectionOutcome.renderUri);
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.renderUri.hashCode();
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        NO_OUTCOME = new AdSelectionOutcome(0L, EMPTY);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome response) {
        this(r0, r4);
        long adSelectionId;
        Uri renderUri;
        Intrinsics.checkNotNullParameter(response, "response");
        adSelectionId = response.getAdSelectionId();
        renderUri = response.getRenderUri();
        Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
    }
}
