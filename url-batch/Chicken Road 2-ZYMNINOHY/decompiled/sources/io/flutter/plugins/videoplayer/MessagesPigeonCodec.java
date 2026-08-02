package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b4, ByteBuffer buffer) {
        i.e(buffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) readValue(buffer);
            if (l4 != null) {
                return PlatformVideoFormat.Companion.ofRaw((int) l4.longValue());
            }
            return null;
        }
        if (b4 == -126) {
            Long l5 = (Long) readValue(buffer);
            if (l5 != null) {
                return PlatformPlaybackState.Companion.ofRaw((int) l5.longValue());
            }
            return null;
        }
        if (b4 == -125) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return InitializationEvent.Companion.fromList(list);
            }
            return null;
        }
        if (b4 == -124) {
            Object readValue2 = readValue(buffer);
            List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (list2 != null) {
                return PlaybackStateChangeEvent.Companion.fromList(list2);
            }
            return null;
        }
        if (b4 == -123) {
            Object readValue3 = readValue(buffer);
            List<? extends Object> list3 = readValue3 instanceof List ? (List) readValue3 : null;
            if (list3 != null) {
                return IsPlayingStateEvent.Companion.fromList(list3);
            }
            return null;
        }
        if (b4 == -122) {
            Object readValue4 = readValue(buffer);
            List<? extends Object> list4 = readValue4 instanceof List ? (List) readValue4 : null;
            if (list4 != null) {
                return AudioTrackChangedEvent.Companion.fromList(list4);
            }
            return null;
        }
        if (b4 == -121) {
            Object readValue5 = readValue(buffer);
            List<? extends Object> list5 = readValue5 instanceof List ? (List) readValue5 : null;
            if (list5 != null) {
                return PlatformVideoViewCreationParams.Companion.fromList(list5);
            }
            return null;
        }
        if (b4 == -120) {
            Object readValue6 = readValue(buffer);
            List<? extends Object> list6 = readValue6 instanceof List ? (List) readValue6 : null;
            if (list6 != null) {
                return CreationOptions.Companion.fromList(list6);
            }
            return null;
        }
        if (b4 == -119) {
            Object readValue7 = readValue(buffer);
            List<? extends Object> list7 = readValue7 instanceof List ? (List) readValue7 : null;
            if (list7 != null) {
                return TexturePlayerIds.Companion.fromList(list7);
            }
            return null;
        }
        if (b4 == -118) {
            Object readValue8 = readValue(buffer);
            List<? extends Object> list8 = readValue8 instanceof List ? (List) readValue8 : null;
            if (list8 != null) {
                return PlaybackState.Companion.fromList(list8);
            }
            return null;
        }
        if (b4 == -117) {
            Object readValue9 = readValue(buffer);
            List<? extends Object> list9 = readValue9 instanceof List ? (List) readValue9 : null;
            if (list9 != null) {
                return AudioTrackMessage.Companion.fromList(list9);
            }
            return null;
        }
        if (b4 == -116) {
            Object readValue10 = readValue(buffer);
            List<? extends Object> list10 = readValue10 instanceof List ? (List) readValue10 : null;
            if (list10 != null) {
                return ExoPlayerAudioTrackData.Companion.fromList(list10);
            }
            return null;
        }
        if (b4 != -115) {
            return super.readValueOfType(b4, buffer);
        }
        Object readValue11 = readValue(buffer);
        List<? extends Object> list11 = readValue11 instanceof List ? (List) readValue11 : null;
        if (list11 != null) {
            return NativeAudioTrackData.Companion.fromList(list11);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        i.e(stream, "stream");
        if (obj instanceof PlatformVideoFormat) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((PlatformVideoFormat) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformPlaybackState) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((PlatformPlaybackState) obj).getRaw()));
            return;
        }
        if (obj instanceof InitializationEvent) {
            stream.write(131);
            writeValue(stream, ((InitializationEvent) obj).toList());
            return;
        }
        if (obj instanceof PlaybackStateChangeEvent) {
            stream.write(132);
            writeValue(stream, ((PlaybackStateChangeEvent) obj).toList());
            return;
        }
        if (obj instanceof IsPlayingStateEvent) {
            stream.write(133);
            writeValue(stream, ((IsPlayingStateEvent) obj).toList());
            return;
        }
        if (obj instanceof AudioTrackChangedEvent) {
            stream.write(134);
            writeValue(stream, ((AudioTrackChangedEvent) obj).toList());
            return;
        }
        if (obj instanceof PlatformVideoViewCreationParams) {
            stream.write(135);
            writeValue(stream, ((PlatformVideoViewCreationParams) obj).toList());
            return;
        }
        if (obj instanceof CreationOptions) {
            stream.write(136);
            writeValue(stream, ((CreationOptions) obj).toList());
            return;
        }
        if (obj instanceof TexturePlayerIds) {
            stream.write(137);
            writeValue(stream, ((TexturePlayerIds) obj).toList());
            return;
        }
        if (obj instanceof PlaybackState) {
            stream.write(138);
            writeValue(stream, ((PlaybackState) obj).toList());
            return;
        }
        if (obj instanceof AudioTrackMessage) {
            stream.write(139);
            writeValue(stream, ((AudioTrackMessage) obj).toList());
        } else if (obj instanceof ExoPlayerAudioTrackData) {
            stream.write(140);
            writeValue(stream, ((ExoPlayerAudioTrackData) obj).toList());
        } else if (!(obj instanceof NativeAudioTrackData)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(141);
            writeValue(stream, ((NativeAudioTrackData) obj).toList());
        }
    }
}
