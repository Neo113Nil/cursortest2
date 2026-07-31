package com.yandex.div.core.view2.errors;

import com.yandex.div.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ErrorViewModel {
    private final int errorCount;

    @NotNull
    private final String errorDetails;
    private final boolean showDetails;
    private final int warningCount;

    @NotNull
    private final String warningDetails;

    public ErrorViewModel(boolean z4, int i4, int i5, @NotNull String errorDetails, @NotNull String warningDetails) {
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        Intrinsics.checkNotNullParameter(warningDetails, "warningDetails");
        this.showDetails = z4;
        this.errorCount = i4;
        this.warningCount = i5;
        this.errorDetails = errorDetails;
        this.warningDetails = warningDetails;
    }

    public static /* synthetic */ ErrorViewModel copy$default(ErrorViewModel errorViewModel, boolean z4, int i4, int i5, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z4 = errorViewModel.showDetails;
        }
        if ((i6 & 2) != 0) {
            i4 = errorViewModel.errorCount;
        }
        if ((i6 & 4) != 0) {
            i5 = errorViewModel.warningCount;
        }
        if ((i6 & 8) != 0) {
            str = errorViewModel.errorDetails;
        }
        if ((i6 & 16) != 0) {
            str2 = errorViewModel.warningDetails;
        }
        String str3 = str2;
        int i7 = i5;
        return errorViewModel.copy(z4, i4, i7, str, str3);
    }

    @NotNull
    public final ErrorViewModel copy(boolean z4, int i4, int i5, @NotNull String errorDetails, @NotNull String warningDetails) {
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        Intrinsics.checkNotNullParameter(warningDetails, "warningDetails");
        return new ErrorViewModel(z4, i4, i5, errorDetails, warningDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return this.showDetails == errorViewModel.showDetails && this.errorCount == errorViewModel.errorCount && this.warningCount == errorViewModel.warningCount && Intrinsics.areEqual(this.errorDetails, errorViewModel.errorDetails) && Intrinsics.areEqual(this.warningDetails, errorViewModel.warningDetails);
    }

    public final int getCounterBackground() {
        int i4 = this.warningCount;
        return (i4 <= 0 || this.errorCount <= 0) ? (i4 == 0 && this.errorCount == 0) ? R$drawable.neutral_counter_background : i4 > 0 ? R$drawable.warning_counter_background : R$drawable.error_counter_background : R$drawable.warning_error_counter_background;
    }

    @NotNull
    public final String getCounterText() {
        int i4 = this.errorCount;
        if (i4 <= 0 || this.warningCount <= 0) {
            int i5 = this.warningCount;
            return i5 > 0 ? String.valueOf(i5) : i4 > 0 ? String.valueOf(i4) : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorCount);
        sb.append('/');
        sb.append(this.warningCount);
        return sb.toString();
    }

    @NotNull
    public final String getDetails() {
        if (this.errorCount <= 0 || this.warningCount <= 0) {
            return this.warningCount > 0 ? this.warningDetails : this.errorDetails;
        }
        return this.errorDetails + "\n\n" + this.warningDetails;
    }

    public final boolean getShowDetails() {
        return this.showDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z4 = this.showDetails;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        return (((((((r02 * 31) + Integer.hashCode(this.errorCount)) * 31) + Integer.hashCode(this.warningCount)) * 31) + this.errorDetails.hashCode()) * 31) + this.warningDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorViewModel(showDetails=" + this.showDetails + ", errorCount=" + this.errorCount + ", warningCount=" + this.warningCount + ", errorDetails=" + this.errorDetails + ", warningDetails=" + this.warningDetails + ')';
    }

    public /* synthetic */ ErrorViewModel(boolean z4, int i4, int i5, String str, String str2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z4, (i6 & 2) != 0 ? 0 : i4, (i6 & 4) != 0 ? 0 : i5, (i6 & 8) != 0 ? "" : str, (i6 & 16) != 0 ? "" : str2);
    }
}
