package com.squareup.cash.ui.widget;

import android.view.View;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.PlaybackInfo;
import androidx.media3.ui.PlayerControlView;
import com.squareup.cash.arcade.treehouse.RadioSelectionGroupBinding;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AmountSelector$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ AmountSelector$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                int i3 = AmountSelector.$r8$clinit;
                ((AmountSelector) obj).setSelected(i2 - 1);
                break;
            case 1:
                PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = (PlayerControlView.PlaybackSpeedAdapter) obj;
                PlayerControlView playerControlView = PlayerControlView.this;
                if (i2 != playbackSpeedAdapter.selectedIndex) {
                    float f = playbackSpeedAdapter.playbackSpeeds[i2];
                    Player player = playerControlView.player;
                    if (player != null && ((ExoPlayerImpl) player).isCommandAvailable(13)) {
                        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) playerControlView.player;
                        exoPlayerImpl.verifyApplicationThread();
                        PlaybackParameters playbackParameters = new PlaybackParameters(f, exoPlayerImpl.playbackInfo.playbackParameters.pitch);
                        exoPlayerImpl.verifyApplicationThread();
                        if (!exoPlayerImpl.playbackInfo.playbackParameters.equals(playbackParameters)) {
                            PlaybackInfo copyWithPlaybackParameters = exoPlayerImpl.playbackInfo.copyWithPlaybackParameters(playbackParameters);
                            exoPlayerImpl.pendingOperationAcks++;
                            exoPlayerImpl.internalPlayer.handler.obtainMessage(4, playbackParameters).sendToTarget();
                            exoPlayerImpl.updatePlaybackInfo(copyWithPlaybackParameters, 0, false, 5, -9223372036854775807L, -1, false);
                        }
                    }
                }
                playerControlView.settingsWindow.dismiss();
                break;
            default:
                Function1 function1 = (Function1) ((RadioSelectionGroupBinding) obj).onSelectionChanged$delegate.getValue();
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i2));
                    break;
                }
                break;
        }
    }
}
