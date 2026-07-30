package com.crrepa.band.my.device.ai.asr.decoder;

import com.crrepa.band.my.device.ai.asr.decoder.b;
import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.exceptions.OpusException;
import com.jieli.jl_audio_decode.opus.OpusManager;

/* loaded from: classes2.dex */
public class c implements b {

    class a implements OnDecodeStreamCallback {
        final /* synthetic */ b.a val$covertCallback;

        a(b.a aVar) {
            this.val$covertCallback = aVar;
        }

        @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
        public void onComplete(String str) {
            this.val$covertCallback.onComplete();
        }

        @Override // com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback
        public void onDecodeStream(byte[] bArr) {
        }

        @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
        public void onError(int i8, String str) {
            this.val$covertCallback.onError(str);
        }

        @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
        public void onStart() {
            this.val$covertCallback.onStart();
        }
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void decode(byte[] bArr) {
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void opus2Audio(String str, String str2, b.a aVar) {
        try {
            new OpusManager().decodeFile(str, str2, new a(aVar));
        } catch (OpusException e8) {
            aVar.onError(e8.getMessage());
        }
    }
}
