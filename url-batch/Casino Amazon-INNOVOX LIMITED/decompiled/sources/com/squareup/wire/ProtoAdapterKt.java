package com.squareup.wire;

import com.google.firebase.messaging.Constants;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Utf8;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u0080\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u000b\u001a8\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u0080\b¢\u0006\u0002\u0010\u000e\u001a8\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u0080\b¢\u0006\u0002\u0010\u000f\u001a.\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0010\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0015\u001a&\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0019\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0080\b¢\u0006\u0002\u0010\u001b\u001a&\u0010\u0019\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0017H\u0080\b¢\u0006\u0002\u0010\u001c\u001a&\u0010\u0019\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0080\b¢\u0006\u0002\u0010\u001f\u001a/\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020$H\u0080\b\u001a/\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010!\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020$H\u0080\b\u001a\u001c\u0010&\u001a\u00020'\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010*\u001a\u00020+H\u0080\b\u001a%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020-0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0080\b\u001a%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020-0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0080\b\u001aC\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u0002H5030\u0003\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u001052\f\u00106\u001a\b\u0012\u0004\u0012\u0002H40\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H50\u0003H\u0080\b\u001a\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003H\u0000\u001a\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0003H\u0000\u001a\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003H\u0000\u001a\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u0003H\u0000\u001a\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020@0\u0003H\u0000\u001a\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020@0\u0003H\u0000\u001a\b\u0010E\u001a\u00020FH\u0000\u001a\b\u0010G\u001a\u00020HH\u0000\u001a\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020'0\u0003H\u0000\u001a\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003H\u0000\u001a\u0012\u0010K\u001a\f\u0012\b\u0012\u00060Lj\u0002`M0\u0003H\u0000\u001a\u0012\u0010N\u001a\f\u0012\b\u0012\u00060Oj\u0002`P0\u0003H\u0000\u001a\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0000\u001a\u001a\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0002\b\u0003\u0018\u0001030\u0003H\u0000\u001a\u0014\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010-0\u0003H\u0000\u001a\u0010\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0\u0003H\u0000\u001a\u0010\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0\u0003H\u0000\u001a0\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HY0\u0003\"\b\b\u0000\u0010Y*\u00020W2\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002HY0\u00032\u0006\u0010[\u001a\u00020'H\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"commonEncodedSizeWithTag", "", "E", "Lcom/squareup/wire/ProtoAdapter;", "tag", "value", "(Lcom/squareup/wire/ProtoAdapter;ILjava/lang/Object;)I", "delegateEncode", "", "writer", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "commonEncodeWithTag", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "commonEncode", "sink", "Lokio/BufferedSink;", "(Lcom/squareup/wire/ProtoAdapter;Lokio/BufferedSink;Ljava/lang/Object;)V", "", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)[B", "commonEncodeByteString", "Lokio/ByteString;", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Lokio/ByteString;", "commonDecode", "bytes", "(Lcom/squareup/wire/ProtoAdapter;[B)Ljava/lang/Object;", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)Ljava/lang/Object;", "source", "Lokio/BufferedSource;", "(Lcom/squareup/wire/ProtoAdapter;Lokio/BufferedSource;)Ljava/lang/Object;", "commonTryDecode", "reader", "Lcom/squareup/wire/ProtoReader;", "destination", "", "Lcom/squareup/wire/ProtoReader32;", "commonToString", "", "(Ljava/lang/Object;)Ljava/lang/String;", "commonWithLabel", Constants.ScionAnalytics.PARAM_LABEL, "Lcom/squareup/wire/WireField$Label;", "commonCreatePacked", "", "commonCreateRepeated", "FIXED_BOOL_SIZE", "FIXED_32_SIZE", "FIXED_64_SIZE", "commonNewMapAdapter", "", "K", "V", "keyAdapter", "valueAdapter", "commonBool", "", "commonInt32", "commonUint32", "commonSint32", "commonFixed32", "commonSfixed32", "commonInt64", "", "commonUint64", "commonSint64", "commonFixed64", "commonSfixed64", "commonFloat", "Lcom/squareup/wire/FloatProtoAdapter;", "commonDouble", "Lcom/squareup/wire/DoubleProtoAdapter;", "commonString", "commonBytes", "commonDuration", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "commonInstant", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "commonEmpty", "commonStructMap", "commonStructList", "commonStructNull", "", "commonStructValue", "", "commonWrapper", "T", "delegate", "typeUrl", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    public static final <E> int commonEncodedSizeWithTag(ProtoAdapter<E> protoAdapter, int i, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (e == null) {
            return 0;
        }
        int encodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize);
        }
        return encodedSize + ProtoWriter.INSTANCE.tagSize$wire_runtime(i);
    }

    public static final <E> void delegateEncode(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(protoAdapter, e));
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ProtoWriter writer, int i, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e == null) {
            return;
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding());
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(writer, (ProtoWriter) e);
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, int i, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = writer.getByteCount();
            protoAdapter.encode(writer, (ReverseProtoWriter) e);
            writer.writeVarint32(writer.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(writer, (ReverseProtoWriter) e);
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding());
    }

    public static final <E> void commonEncode(ProtoAdapter<E> protoAdapter, BufferedSink sink, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        reverseProtoWriter.writeTo(sink);
    }

    public static final <E> byte[] commonEncode(ProtoAdapter<E> protoAdapter, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode((BufferedSink) buffer, (Buffer) e);
        return buffer.readByteArray();
    }

    public static final <E> ByteString commonEncodeByteString(ProtoAdapter<E> protoAdapter, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode((BufferedSink) buffer, (Buffer) e);
        return buffer.readByteString();
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, byte[] bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, ByteString bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, BufferedSource source) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return protoAdapter.decode(new ProtoReader(source));
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader reader, List<E> destination) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader32 reader, List<E> destination) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(ProtoAdapter<E> protoAdapter, WireField.Label label) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
        }
        return new PackedProtoAdapter(protoAdapter);
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        return new MapProtoAdapter(keyAdapter, valueAdapter);
    }

    public static final ProtoAdapter<Boolean> commonBool() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Boolean>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonBool$1
            public int encodedSize(boolean value) {
                return 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) {
                encode(protoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            public void encode(ProtoWriter writer, boolean value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value ? 1 : 0);
            }

            public void encode(ReverseProtoWriter writer, boolean value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            public Boolean redact(boolean value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.int32Size$wire_runtime(value);
            }

            public void encode(ProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(value);
            }

            public void encode(ReverseProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
            }

            public void encode(ProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value);
            }

            public void encode(ReverseProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            public void encode(ProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            public void encode(ReverseProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED32;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed32$1
            public int encodedSize(int value) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            public void encode(ProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(value);
            }

            public void encode(ReverseProtoWriter writer, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonInt64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public void encode(ProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            public void encode(ReverseProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public void encode(ProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            public void encode(ReverseProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            public void encode(ProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            public void encode(ReverseProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED64;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed64$1
            public int encodedSize(long value) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            public void encode(ProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(value);
            }

            public void encode(ReverseProtoWriter writer, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    public static final ProtoAdapter<String> commonString() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<String>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonString$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return (int) Utf8.size$default(value, 0, 0, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, String value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, String value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<ByteString> commonBytes() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ByteString.class);
        final Syntax syntax = Syntax.PROTO_2;
        final ByteString byteString = ByteString.EMPTY;
        return new ProtoAdapter<ByteString>(fieldEncoding, orCreateKotlinClass, syntax, byteString) { // from class: com.squareup.wire.ProtoAdapterKt$commonBytes$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ByteString value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ByteString value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString redact(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Duration.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Duration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonDuration$1
            @Override // com.squareup.wire.ProtoAdapter
            public Duration redact(Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                int encodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? encodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Duration value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Duration value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i);
                        Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag == 2) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i);
                        Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag == 2) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Instant.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Instant>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInstant$1
            @Override // com.squareup.wire.ProtoAdapter
            public Instant redact(Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                int encodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value.getNano();
                return nano != 0 ? encodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Instant value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Instant value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag == 2) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag == 2) {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Unit> commonEmpty() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Unit.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Unit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonEmpty$1
            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return 0;
            }

            /* renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader32 protoReader32) {
                decode2(protoReader32);
                return Unit.INSTANCE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader protoReader) {
                decode2(protoReader);
                return Unit.INSTANCE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit redact(Unit unit) {
                redact2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        reader.readUnknownField(nextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                }
            }

            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        reader.readUnknownField(nextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Map<String, ?>>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructMap$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entry.getKey()) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue());
                    i += ProtoWriter.INSTANCE.tagSize$wire_runtime(1) + ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSizeWithTag) + encodedSizeWithTag;
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Map<String, ?> value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, key) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value2);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(encodedSizeWithTag);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) key);
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, (int) value2);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Map<String, ?> value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) value.entrySet().toArray(new Map.Entry[0]);
                ArraysKt.reverse(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    int byteCount = writer.getByteCount();
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, (int) value2);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) str);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        long beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 == 2) {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag2);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        int beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 == 2) {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag2);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> value) {
                if (value == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(value.size()));
                Iterator<T> it = value.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<List<?>>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructList$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    i += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List<?> value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List<?> value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                for (int size = value.size() - 1; -1 < size; size--) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) value.get(size));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> value) {
                if (value == null) {
                    return null;
                }
                List<?> list = value;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Void.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructNull$1
            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Void value) {
                return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize(value));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeTag(tag, getFieldEncoding());
                encode(writer, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                encode(writer, value);
                writer.writeTag(tag, getFieldEncoding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + readVarint32);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + readVarint32);
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Object>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructValue$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, value);
                }
                if (value instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) value).doubleValue()));
                }
                if (value instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value);
                }
                if (value instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, value);
                }
                if (value instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    return protoAdapter.encodedSizeWithTag(5, (Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, value);
                }
                throw new IllegalArgumentException("unexpected struct value: " + value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Object value) {
                if (value == null) {
                    int encodedSize = encodedSize(value);
                    return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize) + encodedSize;
                }
                return super.encodedSizeWithTag(tag, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    protoAdapter.encodeWithTag(writer, 5, (int) value);
                } else {
                    if (!(value instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + value);
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    protoAdapter.encodeWithTag(writer, 5, (int) value);
                } else {
                    if (!(value instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + value);
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    writer.writeTag(tag, getFieldEncoding());
                    writer.writeVarint32(encodedSize(value));
                    encode(writer, value);
                    return;
                }
                super.encodeWithTag(writer, tag, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    int byteCount = writer.getByteCount();
                    encode(writer, value);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(tag, getFieldEncoding());
                    return;
                }
                super.encodeWithTag(writer, tag, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(value);
                }
                if (!(value instanceof Number)) {
                    if (value instanceof String) {
                        return null;
                    }
                    if (!(value instanceof Boolean)) {
                        if (value instanceof Map) {
                            ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                            return protoAdapter.redact((Map) value);
                        }
                        if (value instanceof List) {
                            return ProtoAdapter.STRUCT_LIST.redact(value);
                        }
                        throw new IllegalArgumentException("unexpected struct value: " + value);
                    }
                }
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                obj = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                obj = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                }
            }
        };
    }

    public static final <T> ProtoAdapter<T> commonWrapper(final ProtoAdapter<T> delegate, final String typeUrl) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass<?> type = delegate.getType();
        final Syntax syntax = Syntax.PROTO_3;
        final T identity = delegate.getIdentity();
        return new ProtoAdapter<T>(typeUrl, fieldEncoding, type, syntax, identity) { // from class: com.squareup.wire.ProtoAdapterKt$commonWrapper$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T value) {
                if (value == null || Intrinsics.areEqual(value, delegate.getIdentity())) {
                    return 0;
                }
                return delegate.encodedSizeWithTag(1, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null || Intrinsics.areEqual(value, delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null || Intrinsics.areEqual(value, delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                T identity2 = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                T identity2 = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T value) {
                if (value == null) {
                    return null;
                }
                return delegate.redact(value);
            }
        };
    }
}
