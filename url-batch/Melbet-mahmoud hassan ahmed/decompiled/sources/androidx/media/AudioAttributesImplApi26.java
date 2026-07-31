package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    static class a extends AudioAttributesImplApi21.a {
        a() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi26(this.f951a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(int i7) {
            this.f951a.setUsage(i7);
            return this;
        }
    }

    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
