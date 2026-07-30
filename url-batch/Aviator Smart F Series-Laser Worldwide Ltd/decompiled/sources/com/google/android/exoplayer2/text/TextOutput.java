package com.google.android.exoplayer2.text;

import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public interface TextOutput {
    void onCues(CueGroup cueGroup);

    @Deprecated
    void onCues(List<Cue> list);
}
