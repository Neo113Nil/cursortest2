package com.squareup.cash.support.chat.views.transcript;

/* loaded from: classes7.dex */
public final /* synthetic */ class TranscriptRecyclerView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TranscriptRecyclerView f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TranscriptRecyclerView$$ExternalSyntheticLambda0(TranscriptRecyclerView transcriptRecyclerView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = transcriptRecyclerView;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        TranscriptRecyclerView transcriptRecyclerView = this.f$0;
        switch (i) {
            case 0:
                int i3 = TranscriptRecyclerView.$r8$clinit;
                transcriptRecyclerView.smoothScrollToPosition(i2);
                break;
            default:
                int i4 = TranscriptRecyclerView.$r8$clinit;
                transcriptRecyclerView.smoothScrollToPosition(i2);
                break;
        }
    }
}
