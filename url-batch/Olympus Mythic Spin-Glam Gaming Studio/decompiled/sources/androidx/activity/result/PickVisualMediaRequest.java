package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.Metadata;

/* compiled from: PickVisualMediaRequest.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001'R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R*\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<set-?>", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "", "maxItems", "I", "getMaxItems", "()I", "setMaxItems$activity_release", "(I)V", "", "isOrderedSelection", "Z", "()Z", "setOrderedSelection$activity_release", "(Z)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "getDefaultTab", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "setDefaultTab$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V", "isCustomAccentColorApplied", "setCustomAccentColorApplied$activity_release", "", "accentColor", "J", "getAccentColor", "()J", "setAccentColor$activity_release", "(J)V", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PickVisualMediaRequest {
    private long accentColor;
    private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;
    private int maxItems;
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

    /* compiled from: PickVisualMediaRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    /* renamed from: isOrderedSelection, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    /* renamed from: isCustomAccentColorApplied, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final long getAccentColor() {
        return this.accentColor;
    }
}
