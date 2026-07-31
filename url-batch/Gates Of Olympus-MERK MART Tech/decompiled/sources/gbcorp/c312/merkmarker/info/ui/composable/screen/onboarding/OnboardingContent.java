package gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMROnboardingScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/composable/screen/onboarding/OnboardingContent;", "", "titleRes", "", "descriptionRes", "imageUrl", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "<init>", "(IILjava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getTitleRes", "()I", "getDescriptionRes", "getImageUrl", "()Ljava/lang/String;", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardingContent {
    public static final int $stable = 0;
    private final int descriptionRes;
    private final ImageVector icon;
    private final String imageUrl;
    private final int titleRes;

    public static /* synthetic */ OnboardingContent copy$default(OnboardingContent onboardingContent, int i, int i2, String str, ImageVector imageVector, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = onboardingContent.titleRes;
        }
        if ((i3 & 2) != 0) {
            i2 = onboardingContent.descriptionRes;
        }
        if ((i3 & 4) != 0) {
            str = onboardingContent.imageUrl;
        }
        if ((i3 & 8) != 0) {
            imageVector = onboardingContent.icon;
        }
        return onboardingContent.copy(i, i2, str, imageVector);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    public final OnboardingContent copy(int titleRes, int descriptionRes, String imageUrl, ImageVector icon) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new OnboardingContent(titleRes, descriptionRes, imageUrl, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingContent)) {
            return false;
        }
        OnboardingContent onboardingContent = (OnboardingContent) other;
        return this.titleRes == onboardingContent.titleRes && this.descriptionRes == onboardingContent.descriptionRes && Intrinsics.areEqual(this.imageUrl, onboardingContent.imageUrl) && Intrinsics.areEqual(this.icon, onboardingContent.icon);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.descriptionRes)) * 31) + this.imageUrl.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "OnboardingContent(titleRes=" + this.titleRes + ", descriptionRes=" + this.descriptionRes + ", imageUrl=" + this.imageUrl + ", icon=" + this.icon + ")";
    }

    public OnboardingContent(int i, int i2, String imageUrl, ImageVector icon) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.titleRes = i;
        this.descriptionRes = i2;
        this.imageUrl = imageUrl;
        this.icon = icon;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }
}
