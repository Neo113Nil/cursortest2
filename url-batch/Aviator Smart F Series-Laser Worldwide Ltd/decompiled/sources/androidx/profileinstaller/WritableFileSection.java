package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    WritableFileSection(@NonNull FileSectionType fileSectionType, int i8, @NonNull byte[] bArr, boolean z7) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i8;
        this.mContents = bArr;
        this.mNeedsCompression = z7;
    }
}
