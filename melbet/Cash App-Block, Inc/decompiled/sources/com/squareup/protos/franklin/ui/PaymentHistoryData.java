package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 ª\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:*«\u0001ª\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u0012\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0005R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0005R\u0016\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0005R\u0016\u0010,\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0005R\u0016\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0005R\u0016\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0005R\u0016\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0005R\u0016\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0005R\u0016\u0010>\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0005R\u0016\u0010?\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0005R\u0016\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0005R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0005R\u0016\u0010L\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0005R\u0016\u0010U\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0005R\u0016\u0010V\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0005R\u0016\u0010W\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010RR\u0016\u0010Y\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0005R\u0016\u0010\\\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u001bR\u0016\u0010]\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0005R\u0016\u0010^\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0005R\u0016\u0010`\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u0004\u0018\u00010b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u0004\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u0004\u0018\u00010h8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0005R\u0016\u0010l\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u001bR\u0016\u0010n\u001a\u0004\u0018\u00010m8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u0004\u0018\u00010p8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0005R\u0016\u0010t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0005R\u0016\u0010v\u001a\u0004\u0018\u00010u8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u0004\u0018\u00010x8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u0004\u0018\u00010{8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u001bR\u0018\u0010\u0085\u0001\u001a\u0004\u0018\u00010u8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010wR\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0005R\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0005R\u0018\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0005R\u0018\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0005R\u0018\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u001bR\u001a\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u001bR\u0018\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010\u0005R\u0018\u0010\u0096\u0001\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010RR\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010\u001bR\u0018\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u0005R\u001a\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001e\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010¡\u0001R\u001f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¡\u0001R\u001e\u0010¥\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¡\u0001R\u001f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¡\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010\u009f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b©\u0001\u0010¡\u0001¨\u0006¿\u0001"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "support_title", "support_short_title", "support_subtitle", "support_accessibility_label", "threaded_title", "threaded_subtitle", "threaded_display_date", "relative_date", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "threaded_button_override", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "preview_title", "short_description", "long_description", "support_description", "getSupport_description$annotations", "()V", "square_message", "", "is_action_required", "Ljava/lang/Boolean;", "is_outstanding_request", "notes", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "primary_button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "secondary_button", "url_to_open", "avatar_url_to_open", "inline_button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "inline_button_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence;", "inline_button_prominence", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence;", "response_title", "is_email_receipt_required", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "Lcom/squareup/protos/franklin/ui/ScenarioPlanMap;", "scenario_plan_map", "Lcom/squareup/protos/franklin/ui/ScenarioPlanMap;", "Lcom/squareup/protos/franklin/api/RatePlan;", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "", "sort_priority", "Ljava/lang/Long;", "transaction_id", "status_text", "detail_view_status_title", "detail_view_status_subtitle", "footer_text", "headline", "header_text", "display_instrument", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection;", "activity_section", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "callout_detail_item", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment;", "status_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment;", "confirm_cancellation_text", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "title_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "subtitle_icon", "threaded_subtitle_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment;", "amount_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment;", "amount_treatment_activity_list", "amount_formatted_activity_list", "amount_formatted", "amount_alternate_formatted", "amount_alternate_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "details_view_content", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "header_subtext", "header_subtext_as_markdown", "more_info_sheet_status_text", "more_info_sheet_status_subtext", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon;", "more_info_sheet_header_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "more_info_sheet_header_icon_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "reactions", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "Lcom/squareup/protos/franklin/ui/Avatar;", "avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "blockchain_transaction_id", "is_bitcoin_transaction", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "support_options", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon;", "avatar_overlay_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon;", "avatar_overlay_icon_url", "dark_theme_avatar_overlay_icon_url", "Lcom/squareup/protos/cash/ui/Color;", "overlay_icon_background_color", "Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "info_module", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "icon_overlay_shape", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "Lcom/squareup/protos/franklin/ui/Timeline;", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "stacked_avatars", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "show_chevron", "subtitle_color", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "associated_payment_options", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "threaded_avatar_url", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "personalization", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "primary_label", "secondary_label", "tertiary_label", "prefer_avatar_field_display_on_ios", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "ui_avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "is_tap_on_avatar_disabled", "secondary_amount_formatted_activity_list", "secondary_amount_treatment_activity_list", "is_tap_on_row_disabled", "accessibility_text", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "personalization_payload", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "Lcom/squareup/protos/franklin/ui/RetroEligibilityStatus;", "retro_eligibility_status", "Lcom/squareup/protos/franklin/ui/RetroEligibilityStatus;", "", "additional_buttons", "Ljava/util/List;", "overflow_buttons", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "detail_rows", "detail_row_phrases", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "header_subtext_attribute_ranges", "Lcom/squareup/protos/franklin/ui/ReceiptSection;", "receipt_sections", "Companion", "Builder", "InlinePaymentHistoryButton", "ThreadedButtonOverride", "InlineButtonTreatment", "InlineButtonProminence", "ActivitySection", "CalloutDetailItem", "DetailRow", "StatusTreatment", "Icon", "AmountTreatment", "DetailsViewContent", "MoreInfoSheetHeaderIcon", "UiStatusTreatment", "SupportOptions", "OverlayIcon", "InfoModule", "IconOverlayShape", "StackedAvatars", "AssociatedPaymentsOverride", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentHistoryData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentHistoryData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final IconOverlayShape DEFAULT_ICON_OVERLAY_SHAPE = IconOverlayShape.CIRCULAR_SHAPE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 93, tag = 104)
    public final String accessibility_text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$ActivitySection#ADAPTER", schemaIndex = 42, tag = 29)
    public final ActivitySection activity_section;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 23, tag = 10)
    public final List<PaymentHistoryButton> additional_buttons;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 55, tag = 94)
    public final String amount_alternate_formatted;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$AmountTreatment#ADAPTER", schemaIndex = 56, tag = 95)
    public final AmountTreatment amount_alternate_treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 54, tag = 65)
    public final String amount_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 53, tag = 62)
    public final String amount_formatted_activity_list;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$AmountTreatment#ADAPTER", schemaIndex = 51, tag = 45)
    public final AmountTreatment amount_treatment;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$AmountTreatment#ADAPTER", schemaIndex = 52, tag = 61)
    public final AmountTreatment amount_treatment_activity_list;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$AssociatedPaymentsOverride#ADAPTER", schemaIndex = 80, tag = 83)
    public final AssociatedPaymentsOverride associated_payment_options;

    @WireField(adapter = "com.squareup.protos.franklin.ui.Avatar#ADAPTER", schemaIndex = 66, tag = 64)
    public final Avatar avatar;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$OverlayIcon#ADAPTER", schemaIndex = 70, tag = 69)
    public final OverlayIcon avatar_overlay_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 71, tag = 74)
    public final String avatar_overlay_icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 22, tag = 73)
    public final String avatar_url_to_open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 67, tag = 66)
    public final String blockchain_transaction_id;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$CalloutDetailItem#ADAPTER", schemaIndex = 43, tag = 85)
    public final CalloutDetailItem callout_detail_item;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 47, tag = 33)
    public final String confirm_cancellation_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 72, tag = 75)
    public final String dark_theme_avatar_overlay_icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 45, tag = 48)
    public final List<String> detail_row_phrases;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$DetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 44, tag = 30)
    public final List<DetailRow> detail_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 37, tag = 47)
    public final String detail_view_status_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 36, tag = 46)
    public final String detail_view_status_title;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$DetailsViewContent#ADAPTER", schemaIndex = 57, tag = 54)
    public final DetailsViewContent details_view_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 41, tag = 28)
    public final String display_instrument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 38, tag = 26)
    public final String footer_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 58, tag = 50)
    public final String header_subtext;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 59, tag = 97)
    public final Boolean header_subtext_as_markdown;

    @WireField(adapter = "com.squareup.protos.franklin.ui.AttributeRange#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 60, tag = 99)
    public final List<AttributeRange> header_subtext_attribute_ranges;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 40, tag = 31)
    public final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 39, tag = 27)
    public final String headline;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$IconOverlayShape#ADAPTER", schemaIndex = 75, tag = 78)
    public final IconOverlayShape icon_overlay_shape;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$InfoModule#ADAPTER", schemaIndex = 74, tag = 70)
    public final InfoModule info_module;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 25, tag = 36)
    public final PaymentHistoryButton inline_button;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$InlineButtonProminence#ADAPTER", schemaIndex = 27, tag = 92)
    public final InlineButtonProminence inline_button_prominence;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$InlineButtonTreatment#ADAPTER", schemaIndex = 26, tag = 43)
    public final InlineButtonTreatment inline_button_treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 16, tag = 5)
    public final Boolean is_action_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 68, tag = 67)
    public final Boolean is_bitcoin_transaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 29, tag = 20)
    public final Boolean is_email_receipt_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 17, tag = 6)
    public final Boolean is_outstanding_request;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 89, tag = 100)
    public final Boolean is_tap_on_avatar_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 92, tag = 103)
    public final Boolean is_tap_on_row_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 13, tag = 3)
    public final String long_description;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$MoreInfoSheetHeaderIcon#ADAPTER", schemaIndex = 63, tag = 53)
    public final MoreInfoSheetHeaderIcon more_info_sheet_header_icon;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$UiStatusTreatment#ADAPTER", schemaIndex = 64, tag = 55)
    public final UiStatusTreatment more_info_sheet_header_icon_treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 62, tag = 52)
    public final String more_info_sheet_status_subtext;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 61, tag = 51)
    public final String more_info_sheet_status_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 18, tag = 9)
    public final String notes;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 24, tag = 35)
    public final List<PaymentHistoryButton> overflow_buttons;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 73, tag = 76)
    public final Color overlay_icon_background_color;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization#ADAPTER", schemaIndex = 82, tag = 87)
    public final Personalization personalization;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.Personalization#ADAPTER", schemaIndex = 94, tag = 105)
    public final com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization_payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 87, tag = 96)
    public final Boolean prefer_avatar_field_display_on_ios;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 11, tag = 63)
    public final String preview_title;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 19, tag = 7)
    public final PaymentHistoryButton primary_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 83, tag = 89)
    public final String primary_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.RatePlan#ADAPTER", schemaIndex = 32, tag = 22)
    public final RatePlan rate_plan;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryReactions#ADAPTER", schemaIndex = 65, tag = 60)
    public final PaymentHistoryReactions reactions;

    @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 86, tag = 93)
    public final List<ReceiptSection> receipt_sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 88)
    public final String relative_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 28, tag = 19)
    public final String response_title;

    @WireField(adapter = "com.squareup.protos.franklin.ui.RetroEligibilityStatus#ADAPTER", schemaIndex = 95, tag = 106)
    public final RetroEligibilityStatus retro_eligibility_status;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ScenarioPlan#ADAPTER", schemaIndex = 30, tag = 21)
    public final ScenarioPlan scenario_plan;

    @WireField(adapter = "com.squareup.protos.franklin.ui.ScenarioPlanMap#ADAPTER", schemaIndex = 31, tag = 40)
    public final ScenarioPlanMap scenario_plan_map;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 90, tag = 101)
    public final String secondary_amount_formatted_activity_list;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$AmountTreatment#ADAPTER", schemaIndex = 91, tag = 102)
    public final AmountTreatment secondary_amount_treatment_activity_list;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 20, tag = 8)
    public final PaymentHistoryButton secondary_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 84, tag = 90)
    public final String secondary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 12, tag = 2)
    public final String short_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 78, tag = 81)
    public final Boolean show_chevron;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 33, tag = 23)
    public final Long sort_priority;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 15, tag = 4)
    public final String square_message;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$StackedAvatars#ADAPTER", schemaIndex = 77, tag = 80)
    public final StackedAvatars stacked_avatars;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 35, tag = 25)
    public final String status_text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$StatusTreatment#ADAPTER", schemaIndex = 46, tag = 32)
    public final StatusTreatment status_treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 34)
    public final String subtitle;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 79, tag = 82)
    public final Color subtitle_color;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$Icon#ADAPTER", schemaIndex = 49, tag = 38)
    public final Icon subtitle_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 71)
    public final String support_accessibility_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 14, tag = 39)
    public final String support_description;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$SupportOptions#ADAPTER", schemaIndex = 69, tag = 68)
    public final SupportOptions support_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 58)
    public final String support_short_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 57)
    public final String support_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 56)
    public final String support_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 85, tag = 91)
    public final String tertiary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 81, tag = 84)
    public final String threaded_avatar_url;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$ThreadedButtonOverride#ADAPTER", schemaIndex = 10, tag = 86)
    public final ThreadedButtonOverride threaded_button_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 44)
    public final String threaded_display_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 42)
    public final String threaded_subtitle;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$Icon#ADAPTER", schemaIndex = 50, tag = 77)
    public final Icon threaded_subtitle_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 41)
    public final String threaded_title;

    @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline#ADAPTER", schemaIndex = 76, tag = 79)
    public final Timeline timeline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String title;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$Icon#ADAPTER", schemaIndex = 48, tag = 37)
    public final Icon title_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 34, tag = 24)
    public final String transaction_id;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 88, tag = 98)
    public final UiAvatar ui_avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 21, tag = 72)
    public final String url_to_open;

    @Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0016\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u0014\u0010!\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"J\u0014\u0010#\u001a\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\"J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0006J\u0016\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010/\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0016\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102¢\u0006\u0003\u0010\u008c\u0001J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0006J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0006J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0006J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0006J\u0010\u00108\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u0006J\u0010\u00109\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0006J\u0010\u0010:\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010\u0006J\u0010\u0010;\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\u0006J\u0010\u0010<\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010>\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010?J\u0014\u0010@\u001a\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\"J\u0014\u0010B\u001a\u00020\u00002\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\"J\u0010\u0010C\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010DJ\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0006J\u0010\u0010F\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010GJ\u0010\u0010H\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010GJ\u0010\u0010I\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010GJ\u0010\u0010J\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010KJ\u0010\u0010L\u001a\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010KJ\u0010\u0010M\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0006J\u0010\u0010N\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\u0006J\u0010\u0010O\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u0006J\u0010\u0010P\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010KJ\u0010\u0010Q\u001a\u00020\u00002\b\u0010Q\u001a\u0004\u0018\u00010RJ\u0010\u0010S\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010\u0006J\u0016\u0010T\u001a\u00020\u00002\b\u0010T\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0014\u0010U\u001a\u00020\u00002\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\"J\u0010\u0010W\u001a\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010\u0006J\u0010\u0010X\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0006J\u0010\u0010Y\u001a\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010ZJ\u0010\u0010[\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\\J\u0010\u0010]\u001a\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010^J\u0010\u0010_\u001a\u00020\u00002\b\u0010_\u001a\u0004\u0018\u00010`J\u0010\u0010a\u001a\u00020\u00002\b\u0010a\u001a\u0004\u0018\u00010\u0006J\u0016\u0010b\u001a\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010c\u001a\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010dJ\u0010\u0010e\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010fJ\u0010\u0010g\u001a\u00020\u00002\b\u0010g\u001a\u0004\u0018\u00010\u0006J\u0010\u0010h\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010\u0006J\u0010\u0010i\u001a\u00020\u00002\b\u0010i\u001a\u0004\u0018\u00010jJ\u0010\u0010k\u001a\u00020\u00002\b\u0010k\u001a\u0004\u0018\u00010lJ\u0010\u0010m\u001a\u00020\u00002\b\u0010m\u001a\u0004\u0018\u00010nJ\u0010\u0010o\u001a\u00020\u00002\b\u0010o\u001a\u0004\u0018\u00010pJ\u0010\u0010q\u001a\u00020\u00002\b\u0010q\u001a\u0004\u0018\u00010rJ\u0016\u0010s\u001a\u00020\u00002\b\u0010s\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010t\u001a\u00020\u00002\b\u0010t\u001a\u0004\u0018\u00010jJ\u0010\u0010u\u001a\u00020\u00002\b\u0010u\u001a\u0004\u0018\u00010vJ\u0010\u0010w\u001a\u00020\u00002\b\u0010w\u001a\u0004\u0018\u00010\u0006J\u0010\u0010x\u001a\u00020\u00002\b\u0010x\u001a\u0004\u0018\u00010yJ\u0010\u0010z\u001a\u00020\u00002\b\u0010z\u001a\u0004\u0018\u00010\u0006J\u0010\u0010{\u001a\u00020\u00002\b\u0010{\u001a\u0004\u0018\u00010\u0006J\u0010\u0010|\u001a\u00020\u00002\b\u0010|\u001a\u0004\u0018\u00010\u0006J\u0014\u0010}\u001a\u00020\u00002\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\"J\u0016\u0010\u007f\u001a\u00020\u00002\b\u0010\u007f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0013\u0010\u0080\u0001\u001a\u00020\u00002\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001J\u0018\u0010\u0082\u0001\u001a\u00020\u00002\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0084\u0001\u001a\u00020\u00002\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010KJ\u0018\u0010\u0085\u0001\u001a\u00020\u00002\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0018¢\u0006\u0003\u0010\u008b\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u00002\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006J\u0013\u0010\u0087\u0001\u001a\u00020\u00002\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001J\u0013\u0010\u0089\u0001\u001a\u00020\u00002\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001J\t\u0010\u008d\u0001\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00103R\u0014\u00104\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010T\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010c\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010g\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010i\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010m\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010o\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010q\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010s\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010t\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010u\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010w\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010z\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010|\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u007f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u008e\u0001"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "<init>", "()V", "title", "", "subtitle", "support_title", "support_short_title", "support_subtitle", "support_accessibility_label", "threaded_title", "threaded_subtitle", "threaded_display_date", "relative_date", "threaded_button_override", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "preview_title", "short_description", "long_description", "support_description", "square_message", "is_action_required", "", "Ljava/lang/Boolean;", "is_outstanding_request", "notes", "primary_button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "secondary_button", "url_to_open", "avatar_url_to_open", "additional_buttons", "", "overflow_buttons", "inline_button", "inline_button_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "inline_button_prominence", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence;", "response_title", "is_email_receipt_required", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "scenario_plan_map", "Lcom/squareup/protos/franklin/ui/ScenarioPlanMap;", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "sort_priority", "", "Ljava/lang/Long;", "transaction_id", "status_text", "detail_view_status_title", "detail_view_status_subtitle", "footer_text", "headline", "header_text", "display_instrument", "activity_section", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection;", "callout_detail_item", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "detail_rows", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "detail_row_phrases", "status_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment;", "confirm_cancellation_text", "title_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "subtitle_icon", "threaded_subtitle_icon", "amount_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment;", "amount_treatment_activity_list", "amount_formatted_activity_list", "amount_formatted", "amount_alternate_formatted", "amount_alternate_treatment", "details_view_content", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "header_subtext", "header_subtext_as_markdown", "header_subtext_attribute_ranges", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "more_info_sheet_status_text", "more_info_sheet_status_subtext", "more_info_sheet_header_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon;", "more_info_sheet_header_icon_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "reactions", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "blockchain_transaction_id", "is_bitcoin_transaction", "support_options", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "avatar_overlay_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon;", "avatar_overlay_icon_url", "dark_theme_avatar_overlay_icon_url", "overlay_icon_background_color", "Lcom/squareup/protos/cash/ui/Color;", "info_module", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "icon_overlay_shape", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "stacked_avatars", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "show_chevron", "subtitle_color", "associated_payment_options", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "threaded_avatar_url", "personalization", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "primary_label", "secondary_label", "tertiary_label", "receipt_sections", "Lcom/squareup/protos/franklin/ui/ReceiptSection;", "prefer_avatar_field_display_on_ios", "ui_avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "is_tap_on_avatar_disabled", "secondary_amount_formatted_activity_list", "secondary_amount_treatment_activity_list", "is_tap_on_row_disabled", "accessibility_text", "personalization_payload", "Lcom/squareup/cash/mosaic/personalization/api/v2/Personalization;", "retro_eligibility_status", "Lcom/squareup/protos/franklin/ui/RetroEligibilityStatus;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accessibility_text;
        public ActivitySection activity_section;
        public List<PaymentHistoryButton> additional_buttons;
        public String amount_alternate_formatted;
        public AmountTreatment amount_alternate_treatment;
        public String amount_formatted;
        public String amount_formatted_activity_list;
        public AmountTreatment amount_treatment;
        public AmountTreatment amount_treatment_activity_list;
        public AssociatedPaymentsOverride associated_payment_options;
        public Avatar avatar;
        public OverlayIcon avatar_overlay_icon;
        public String avatar_overlay_icon_url;
        public String avatar_url_to_open;
        public String blockchain_transaction_id;
        public CalloutDetailItem callout_detail_item;
        public String confirm_cancellation_text;
        public String dark_theme_avatar_overlay_icon_url;
        public List<String> detail_row_phrases;
        public List<DetailRow> detail_rows;
        public String detail_view_status_subtitle;
        public String detail_view_status_title;
        public DetailsViewContent details_view_content;
        public String display_instrument;
        public String footer_text;
        public String header_subtext;
        public Boolean header_subtext_as_markdown;
        public List<AttributeRange> header_subtext_attribute_ranges;
        public String header_text;
        public String headline;
        public IconOverlayShape icon_overlay_shape;
        public InfoModule info_module;
        public PaymentHistoryButton inline_button;
        public InlineButtonProminence inline_button_prominence;
        public InlineButtonTreatment inline_button_treatment;
        public Boolean is_action_required;
        public Boolean is_bitcoin_transaction;
        public Boolean is_email_receipt_required;
        public Boolean is_outstanding_request;
        public Boolean is_tap_on_avatar_disabled;
        public Boolean is_tap_on_row_disabled;
        public String long_description;
        public MoreInfoSheetHeaderIcon more_info_sheet_header_icon;
        public UiStatusTreatment more_info_sheet_header_icon_treatment;
        public String more_info_sheet_status_subtext;
        public String more_info_sheet_status_text;
        public String notes;
        public List<PaymentHistoryButton> overflow_buttons;
        public Color overlay_icon_background_color;
        public Personalization personalization;
        public com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization_payload;
        public Boolean prefer_avatar_field_display_on_ios;
        public String preview_title;
        public PaymentHistoryButton primary_button;
        public String primary_label;
        public RatePlan rate_plan;
        public PaymentHistoryReactions reactions;
        public List<ReceiptSection> receipt_sections;
        public String relative_date;
        public String response_title;
        public RetroEligibilityStatus retro_eligibility_status;
        public ScenarioPlan scenario_plan;
        public ScenarioPlanMap scenario_plan_map;
        public String secondary_amount_formatted_activity_list;
        public AmountTreatment secondary_amount_treatment_activity_list;
        public PaymentHistoryButton secondary_button;
        public String secondary_label;
        public String short_description;
        public Boolean show_chevron;
        public Long sort_priority;
        public String square_message;
        public StackedAvatars stacked_avatars;
        public String status_text;
        public StatusTreatment status_treatment;
        public String subtitle;
        public Color subtitle_color;
        public Icon subtitle_icon;
        public String support_accessibility_label;
        public String support_description;
        public SupportOptions support_options;
        public String support_short_title;
        public String support_subtitle;
        public String support_title;
        public String tertiary_label;
        public String threaded_avatar_url;
        public ThreadedButtonOverride threaded_button_override;
        public String threaded_display_date;
        public String threaded_subtitle;
        public Icon threaded_subtitle_icon;
        public String threaded_title;
        public Timeline timeline;
        public String title;
        public Icon title_icon;
        public String transaction_id;
        public UiAvatar ui_avatar;
        public String url_to_open;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.additional_buttons = emptyList;
            this.overflow_buttons = emptyList;
            this.detail_rows = emptyList;
            this.detail_row_phrases = emptyList;
            this.header_subtext_attribute_ranges = emptyList;
            this.receipt_sections = emptyList;
        }

        public final Builder accessibility_text(String accessibility_text) {
            this.accessibility_text = accessibility_text;
            return this;
        }

        public final Builder activity_section(ActivitySection activity_section) {
            this.activity_section = activity_section;
            return this;
        }

        public final Builder additional_buttons(List<PaymentHistoryButton> additional_buttons) {
            additional_buttons.getClass();
            TransactorKt.checkElementsNotNull(additional_buttons);
            this.additional_buttons = additional_buttons;
            return this;
        }

        public final Builder amount_alternate_formatted(String amount_alternate_formatted) {
            this.amount_alternate_formatted = amount_alternate_formatted;
            return this;
        }

        public final Builder amount_alternate_treatment(AmountTreatment amount_alternate_treatment) {
            this.amount_alternate_treatment = amount_alternate_treatment;
            return this;
        }

        public final Builder amount_formatted(String amount_formatted) {
            this.amount_formatted = amount_formatted;
            return this;
        }

        public final Builder amount_formatted_activity_list(String amount_formatted_activity_list) {
            this.amount_formatted_activity_list = amount_formatted_activity_list;
            return this;
        }

        public final Builder amount_treatment(AmountTreatment amount_treatment) {
            this.amount_treatment = amount_treatment;
            return this;
        }

        public final Builder amount_treatment_activity_list(AmountTreatment amount_treatment_activity_list) {
            this.amount_treatment_activity_list = amount_treatment_activity_list;
            return this;
        }

        public final Builder associated_payment_options(AssociatedPaymentsOverride associated_payment_options) {
            this.associated_payment_options = associated_payment_options;
            return this;
        }

        public final Builder avatar(Avatar avatar) {
            this.avatar = avatar;
            return this;
        }

        public final Builder avatar_overlay_icon(OverlayIcon avatar_overlay_icon) {
            this.avatar_overlay_icon = avatar_overlay_icon;
            return this;
        }

        public final Builder avatar_overlay_icon_url(String avatar_overlay_icon_url) {
            this.avatar_overlay_icon_url = avatar_overlay_icon_url;
            return this;
        }

        public final Builder avatar_url_to_open(String avatar_url_to_open) {
            this.avatar_url_to_open = avatar_url_to_open;
            return this;
        }

        public final Builder blockchain_transaction_id(String blockchain_transaction_id) {
            this.blockchain_transaction_id = blockchain_transaction_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentHistoryData build() {
            return new PaymentHistoryData(this.title, this.subtitle, this.support_title, this.support_short_title, this.support_subtitle, this.support_accessibility_label, this.threaded_title, this.threaded_subtitle, this.threaded_display_date, this.relative_date, this.threaded_button_override, this.preview_title, this.short_description, this.long_description, this.support_description, this.square_message, this.is_action_required, this.is_outstanding_request, this.notes, this.primary_button, this.secondary_button, this.url_to_open, this.avatar_url_to_open, this.additional_buttons, this.overflow_buttons, this.inline_button, this.inline_button_treatment, this.inline_button_prominence, this.response_title, this.is_email_receipt_required, this.scenario_plan, this.scenario_plan_map, this.rate_plan, this.sort_priority, this.transaction_id, this.status_text, this.detail_view_status_title, this.detail_view_status_subtitle, this.footer_text, this.headline, this.header_text, this.display_instrument, this.activity_section, this.callout_detail_item, this.detail_rows, this.detail_row_phrases, this.status_treatment, this.confirm_cancellation_text, this.title_icon, this.subtitle_icon, this.threaded_subtitle_icon, this.amount_treatment, this.amount_treatment_activity_list, this.amount_formatted_activity_list, this.amount_formatted, this.amount_alternate_formatted, this.amount_alternate_treatment, this.details_view_content, this.header_subtext, this.header_subtext_as_markdown, this.header_subtext_attribute_ranges, this.more_info_sheet_status_text, this.more_info_sheet_status_subtext, this.more_info_sheet_header_icon, this.more_info_sheet_header_icon_treatment, this.reactions, this.avatar, this.blockchain_transaction_id, this.is_bitcoin_transaction, this.support_options, this.avatar_overlay_icon, this.avatar_overlay_icon_url, this.dark_theme_avatar_overlay_icon_url, this.overlay_icon_background_color, this.info_module, this.icon_overlay_shape, this.timeline, this.stacked_avatars, this.show_chevron, this.subtitle_color, this.associated_payment_options, this.threaded_avatar_url, this.personalization, this.primary_label, this.secondary_label, this.tertiary_label, this.receipt_sections, this.prefer_avatar_field_display_on_ios, this.ui_avatar, this.is_tap_on_avatar_disabled, this.secondary_amount_formatted_activity_list, this.secondary_amount_treatment_activity_list, this.is_tap_on_row_disabled, this.accessibility_text, this.personalization_payload, this.retro_eligibility_status, buildUnknownFields());
        }

        public final Builder callout_detail_item(CalloutDetailItem callout_detail_item) {
            this.callout_detail_item = callout_detail_item;
            return this;
        }

        public final Builder confirm_cancellation_text(String confirm_cancellation_text) {
            this.confirm_cancellation_text = confirm_cancellation_text;
            return this;
        }

        public final Builder dark_theme_avatar_overlay_icon_url(String dark_theme_avatar_overlay_icon_url) {
            this.dark_theme_avatar_overlay_icon_url = dark_theme_avatar_overlay_icon_url;
            return this;
        }

        public final Builder detail_row_phrases(List<String> detail_row_phrases) {
            detail_row_phrases.getClass();
            TransactorKt.checkElementsNotNull(detail_row_phrases);
            this.detail_row_phrases = detail_row_phrases;
            return this;
        }

        public final Builder detail_rows(List<DetailRow> detail_rows) {
            detail_rows.getClass();
            TransactorKt.checkElementsNotNull(detail_rows);
            this.detail_rows = detail_rows;
            return this;
        }

        public final Builder detail_view_status_subtitle(String detail_view_status_subtitle) {
            this.detail_view_status_subtitle = detail_view_status_subtitle;
            return this;
        }

        public final Builder detail_view_status_title(String detail_view_status_title) {
            this.detail_view_status_title = detail_view_status_title;
            return this;
        }

        public final Builder details_view_content(DetailsViewContent details_view_content) {
            this.details_view_content = details_view_content;
            return this;
        }

        public final Builder display_instrument(String display_instrument) {
            this.display_instrument = display_instrument;
            return this;
        }

        public final Builder footer_text(String footer_text) {
            this.footer_text = footer_text;
            return this;
        }

        public final Builder header_subtext(String header_subtext) {
            this.header_subtext = header_subtext;
            return this;
        }

        public final Builder header_subtext_as_markdown(Boolean header_subtext_as_markdown) {
            this.header_subtext_as_markdown = header_subtext_as_markdown;
            return this;
        }

        public final Builder header_subtext_attribute_ranges(List<AttributeRange> header_subtext_attribute_ranges) {
            header_subtext_attribute_ranges.getClass();
            TransactorKt.checkElementsNotNull(header_subtext_attribute_ranges);
            this.header_subtext_attribute_ranges = header_subtext_attribute_ranges;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public final Builder icon_overlay_shape(IconOverlayShape icon_overlay_shape) {
            this.icon_overlay_shape = icon_overlay_shape;
            return this;
        }

        public final Builder info_module(InfoModule info_module) {
            this.info_module = info_module;
            return this;
        }

        public final Builder inline_button(PaymentHistoryButton inline_button) {
            this.inline_button = inline_button;
            return this;
        }

        public final Builder inline_button_prominence(InlineButtonProminence inline_button_prominence) {
            this.inline_button_prominence = inline_button_prominence;
            return this;
        }

        public final Builder inline_button_treatment(InlineButtonTreatment inline_button_treatment) {
            this.inline_button_treatment = inline_button_treatment;
            return this;
        }

        public final Builder is_action_required(Boolean is_action_required) {
            this.is_action_required = is_action_required;
            return this;
        }

        public final Builder is_bitcoin_transaction(Boolean is_bitcoin_transaction) {
            this.is_bitcoin_transaction = is_bitcoin_transaction;
            return this;
        }

        public final Builder is_email_receipt_required(Boolean is_email_receipt_required) {
            this.is_email_receipt_required = is_email_receipt_required;
            return this;
        }

        public final Builder is_outstanding_request(Boolean is_outstanding_request) {
            this.is_outstanding_request = is_outstanding_request;
            return this;
        }

        public final Builder is_tap_on_avatar_disabled(Boolean is_tap_on_avatar_disabled) {
            this.is_tap_on_avatar_disabled = is_tap_on_avatar_disabled;
            return this;
        }

        public final Builder is_tap_on_row_disabled(Boolean is_tap_on_row_disabled) {
            this.is_tap_on_row_disabled = is_tap_on_row_disabled;
            return this;
        }

        public final Builder long_description(String long_description) {
            this.long_description = long_description;
            return this;
        }

        public final Builder more_info_sheet_header_icon(MoreInfoSheetHeaderIcon more_info_sheet_header_icon) {
            this.more_info_sheet_header_icon = more_info_sheet_header_icon;
            return this;
        }

        public final Builder more_info_sheet_header_icon_treatment(UiStatusTreatment more_info_sheet_header_icon_treatment) {
            this.more_info_sheet_header_icon_treatment = more_info_sheet_header_icon_treatment;
            return this;
        }

        public final Builder more_info_sheet_status_subtext(String more_info_sheet_status_subtext) {
            this.more_info_sheet_status_subtext = more_info_sheet_status_subtext;
            return this;
        }

        public final Builder more_info_sheet_status_text(String more_info_sheet_status_text) {
            this.more_info_sheet_status_text = more_info_sheet_status_text;
            return this;
        }

        public final Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public final Builder overflow_buttons(List<PaymentHistoryButton> overflow_buttons) {
            overflow_buttons.getClass();
            TransactorKt.checkElementsNotNull(overflow_buttons);
            this.overflow_buttons = overflow_buttons;
            return this;
        }

        public final Builder overlay_icon_background_color(Color overlay_icon_background_color) {
            this.overlay_icon_background_color = overlay_icon_background_color;
            return this;
        }

        public final Builder personalization(Personalization personalization) {
            this.personalization = personalization;
            return this;
        }

        public final Builder personalization_payload(com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization_payload) {
            this.personalization_payload = personalization_payload;
            return this;
        }

        public final Builder prefer_avatar_field_display_on_ios(Boolean prefer_avatar_field_display_on_ios) {
            this.prefer_avatar_field_display_on_ios = prefer_avatar_field_display_on_ios;
            return this;
        }

        public final Builder preview_title(String preview_title) {
            this.preview_title = preview_title;
            return this;
        }

        public final Builder primary_button(PaymentHistoryButton primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        public final Builder primary_label(String primary_label) {
            this.primary_label = primary_label;
            return this;
        }

        public final Builder rate_plan(RatePlan rate_plan) {
            this.rate_plan = rate_plan;
            return this;
        }

        public final Builder reactions(PaymentHistoryReactions reactions) {
            this.reactions = reactions;
            return this;
        }

        public final Builder receipt_sections(List<ReceiptSection> receipt_sections) {
            receipt_sections.getClass();
            TransactorKt.checkElementsNotNull(receipt_sections);
            this.receipt_sections = receipt_sections;
            return this;
        }

        public final Builder relative_date(String relative_date) {
            this.relative_date = relative_date;
            return this;
        }

        public final Builder response_title(String response_title) {
            this.response_title = response_title;
            return this;
        }

        public final Builder retro_eligibility_status(RetroEligibilityStatus retro_eligibility_status) {
            this.retro_eligibility_status = retro_eligibility_status;
            return this;
        }

        public final Builder scenario_plan(ScenarioPlan scenario_plan) {
            this.scenario_plan = scenario_plan;
            return this;
        }

        public final Builder scenario_plan_map(ScenarioPlanMap scenario_plan_map) {
            this.scenario_plan_map = scenario_plan_map;
            return this;
        }

        public final Builder secondary_amount_formatted_activity_list(String secondary_amount_formatted_activity_list) {
            this.secondary_amount_formatted_activity_list = secondary_amount_formatted_activity_list;
            return this;
        }

        public final Builder secondary_amount_treatment_activity_list(AmountTreatment secondary_amount_treatment_activity_list) {
            this.secondary_amount_treatment_activity_list = secondary_amount_treatment_activity_list;
            return this;
        }

        public final Builder secondary_button(PaymentHistoryButton secondary_button) {
            this.secondary_button = secondary_button;
            return this;
        }

        public final Builder secondary_label(String secondary_label) {
            this.secondary_label = secondary_label;
            return this;
        }

        public final Builder short_description(String short_description) {
            this.short_description = short_description;
            return this;
        }

        public final Builder show_chevron(Boolean show_chevron) {
            this.show_chevron = show_chevron;
            return this;
        }

        public final Builder sort_priority(Long sort_priority) {
            this.sort_priority = sort_priority;
            return this;
        }

        public final Builder square_message(String square_message) {
            this.square_message = square_message;
            return this;
        }

        public final Builder stacked_avatars(StackedAvatars stacked_avatars) {
            this.stacked_avatars = stacked_avatars;
            return this;
        }

        public final Builder status_text(String status_text) {
            this.status_text = status_text;
            return this;
        }

        public final Builder status_treatment(StatusTreatment status_treatment) {
            this.status_treatment = status_treatment;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder subtitle_color(Color subtitle_color) {
            this.subtitle_color = subtitle_color;
            return this;
        }

        public final Builder subtitle_icon(Icon subtitle_icon) {
            this.subtitle_icon = subtitle_icon;
            return this;
        }

        public final Builder support_accessibility_label(String support_accessibility_label) {
            this.support_accessibility_label = support_accessibility_label;
            return this;
        }

        @Deprecated
        public final Builder support_description(String support_description) {
            this.support_description = support_description;
            return this;
        }

        public final Builder support_options(SupportOptions support_options) {
            this.support_options = support_options;
            return this;
        }

        public final Builder support_short_title(String support_short_title) {
            this.support_short_title = support_short_title;
            return this;
        }

        public final Builder support_subtitle(String support_subtitle) {
            this.support_subtitle = support_subtitle;
            return this;
        }

        public final Builder support_title(String support_title) {
            this.support_title = support_title;
            return this;
        }

        public final Builder tertiary_label(String tertiary_label) {
            this.tertiary_label = tertiary_label;
            return this;
        }

        public final Builder threaded_avatar_url(String threaded_avatar_url) {
            this.threaded_avatar_url = threaded_avatar_url;
            return this;
        }

        public final Builder threaded_button_override(ThreadedButtonOverride threaded_button_override) {
            this.threaded_button_override = threaded_button_override;
            return this;
        }

        public final Builder threaded_display_date(String threaded_display_date) {
            this.threaded_display_date = threaded_display_date;
            return this;
        }

        public final Builder threaded_subtitle(String threaded_subtitle) {
            this.threaded_subtitle = threaded_subtitle;
            return this;
        }

        public final Builder threaded_subtitle_icon(Icon threaded_subtitle_icon) {
            this.threaded_subtitle_icon = threaded_subtitle_icon;
            return this;
        }

        public final Builder threaded_title(String threaded_title) {
            this.threaded_title = threaded_title;
            return this;
        }

        public final Builder timeline(Timeline timeline) {
            this.timeline = timeline;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder title_icon(Icon title_icon) {
            this.title_icon = title_icon;
            return this;
        }

        public final Builder transaction_id(String transaction_id) {
            this.transaction_id = transaction_id;
            return this;
        }

        public final Builder ui_avatar(UiAvatar ui_avatar) {
            this.ui_avatar = ui_avatar;
            return this;
        }

        public final Builder url_to_open(String url_to_open) {
            this.url_to_open = url_to_open;
            return this;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "DetailRowTreatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$DetailRow$DetailRowTreatment#ADAPTER", schemaIndex = 2, tag = 3)
        public final DetailRowTreatment treatment;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String value;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String label;
            public DetailRowTreatment treatment;
            public String value;

            @Override // com.squareup.wire.Message.Builder
            public DetailRow build() {
                return new DetailRow(this.label, this.value, this.treatment, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder treatment(DetailRowTreatment treatment) {
                this.treatment = treatment;
                return this;
            }

            public final Builder value(String value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$DetailRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.DetailRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.DetailRow((String) obj, (String) obj2, (PaymentHistoryData.DetailRow.DetailRowTreatment) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = PaymentHistoryData.DetailRow.DetailRowTreatment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    PaymentHistoryData.DetailRow.DetailRowTreatment.ADAPTER.encodeWithTag(writer, 3, value.treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.DetailRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return PaymentHistoryData.DetailRow.DetailRowTreatment.ADAPTER.encodedSizeWithTag(3, value.treatment) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.DetailRow redact(PaymentHistoryData.DetailRow value) {
                    value.getClass();
                    return PaymentHistoryData.DetailRow.copy$default(value, null, null, null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentHistoryData.DetailRow.DetailRowTreatment.ADAPTER.encodeWithTag(writer, 3, value.treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DetailRow(String str, String str2, DetailRowTreatment detailRowTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : detailRowTreatment, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, String str, String str2, DetailRowTreatment detailRowTreatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detailRow.label;
            }
            if ((i & 2) != 0) {
                str2 = detailRow.value;
            }
            if ((i & 4) != 0) {
                detailRowTreatment = detailRow.treatment;
            }
            if ((i & 8) != 0) {
                byteString = detailRow.unknownFields();
            }
            return detailRow.copy(str, str2, detailRowTreatment, byteString);
        }

        public final DetailRow copy(String label, String value, DetailRowTreatment treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new DetailRow(label, value, treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) other;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && this.treatment == detailRow.treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            DetailRowTreatment detailRowTreatment = this.treatment;
            int hashCode4 = hashCode3 + (detailRowTreatment != null ? detailRowTreatment.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.value = this.value;
            builder.treatment = this.treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            if (this.value != null) {
                arrayList.add("value=██");
            }
            DetailRowTreatment detailRowTreatment = this.treatment;
            if (detailRowTreatment != null) {
                arrayList.add("treatment=" + detailRowTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "STRIKETHROUGH", "LABEL_INDENT", "BOLD", "TINT", "SEPARATOR", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DetailRowTreatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ DetailRowTreatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final DetailRowTreatment NORMAL = new DetailRowTreatment("NORMAL", 0, 1);
            public static final DetailRowTreatment STRIKETHROUGH = new DetailRowTreatment("STRIKETHROUGH", 1, 2);
            public static final DetailRowTreatment LABEL_INDENT = new DetailRowTreatment("LABEL_INDENT", 2, 3);
            public static final DetailRowTreatment BOLD = new DetailRowTreatment("BOLD", 3, 4);
            public static final DetailRowTreatment TINT = new DetailRowTreatment("TINT", 4, 5);
            public static final DetailRowTreatment SEPARATOR = new DetailRowTreatment("SEPARATOR", 5, 6);

            private static final /* synthetic */ DetailRowTreatment[] $values() {
                return new DetailRowTreatment[]{NORMAL, STRIKETHROUGH, LABEL_INDENT, BOLD, TINT, SEPARATOR};
            }

            static {
                DetailRowTreatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRowTreatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$DetailRow$DetailRowTreatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public PaymentHistoryData.DetailRow.DetailRowTreatment fromValue(int value) {
                        return PaymentHistoryData.DetailRow.DetailRowTreatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private DetailRowTreatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final DetailRowTreatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static DetailRowTreatment valueOf(String str) {
                return (DetailRowTreatment) Enum.valueOf(DetailRowTreatment.class, str);
            }

            public static DetailRowTreatment[] values() {
                return (DetailRowTreatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$DetailRowTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final DetailRowTreatment fromValue(int value) {
                    switch (value) {
                        case 1:
                            return DetailRowTreatment.NORMAL;
                        case 2:
                            return DetailRowTreatment.STRIKETHROUGH;
                        case 3:
                            return DetailRowTreatment.LABEL_INDENT;
                        case 4:
                            return DetailRowTreatment.BOLD;
                        case 5:
                            return DetailRowTreatment.TINT;
                        case 6:
                            return DetailRowTreatment.SEPARATOR;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DetailRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DetailRow() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, String str2, DetailRowTreatment detailRowTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.treatment = detailRowTreatment;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentHistoryData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$Companion$ADAPTER$1
            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                */
            @Override // com.squareup.wire.ProtoAdapter
            public com.squareup.protos.franklin.ui.PaymentHistoryData decode(com.squareup.wire.ProtoReader r105) {
                /*
                    Method dump skipped, instructions count: 4654
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.franklin.ui.PaymentHistoryData$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):com.squareup.protos.franklin.ui.PaymentHistoryData");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentHistoryData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 34, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 56, value.support_title);
                protoAdapter2.encodeWithTag(writer, 58, value.support_short_title);
                protoAdapter2.encodeWithTag(writer, 57, value.support_subtitle);
                protoAdapter2.encodeWithTag(writer, 71, value.support_accessibility_label);
                protoAdapter2.encodeWithTag(writer, 41, value.threaded_title);
                protoAdapter2.encodeWithTag(writer, 42, value.threaded_subtitle);
                protoAdapter2.encodeWithTag(writer, 44, value.threaded_display_date);
                protoAdapter2.encodeWithTag(writer, 88, value.relative_date);
                PaymentHistoryData.ThreadedButtonOverride.ADAPTER.encodeWithTag(writer, 86, value.threaded_button_override);
                protoAdapter2.encodeWithTag(writer, 63, value.preview_title);
                protoAdapter2.encodeWithTag(writer, 2, value.short_description);
                protoAdapter2.encodeWithTag(writer, 3, value.long_description);
                protoAdapter2.encodeWithTag(writer, 39, value.support_description);
                protoAdapter2.encodeWithTag(writer, 4, value.square_message);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 5, value.is_action_required);
                protoAdapter3.encodeWithTag(writer, 6, value.is_outstanding_request);
                protoAdapter2.encodeWithTag(writer, 9, value.notes);
                ProtoAdapter protoAdapter4 = PaymentHistoryButton.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 7, value.primary_button);
                protoAdapter4.encodeWithTag(writer, 8, value.secondary_button);
                protoAdapter2.encodeWithTag(writer, 72, value.url_to_open);
                protoAdapter2.encodeWithTag(writer, 73, value.avatar_url_to_open);
                protoAdapter4.asRepeated().encodeWithTag(writer, 10, value.additional_buttons);
                protoAdapter4.asRepeated().encodeWithTag(writer, 35, value.overflow_buttons);
                protoAdapter4.encodeWithTag(writer, 36, value.inline_button);
                PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(writer, 43, value.inline_button_treatment);
                PaymentHistoryData.InlineButtonProminence.ADAPTER.encodeWithTag(writer, 92, value.inline_button_prominence);
                protoAdapter2.encodeWithTag(writer, 19, value.response_title);
                protoAdapter3.encodeWithTag(writer, 20, value.is_email_receipt_required);
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 21, value.scenario_plan);
                ScenarioPlanMap.ADAPTER.encodeWithTag(writer, 40, value.scenario_plan_map);
                RatePlan.ADAPTER.encodeWithTag(writer, 22, value.rate_plan);
                ProtoAdapter.INT64.encodeWithTag(writer, 23, value.sort_priority);
                protoAdapter2.encodeWithTag(writer, 24, value.transaction_id);
                protoAdapter2.encodeWithTag(writer, 25, value.status_text);
                protoAdapter2.encodeWithTag(writer, 46, value.detail_view_status_title);
                protoAdapter2.encodeWithTag(writer, 47, value.detail_view_status_subtitle);
                protoAdapter2.encodeWithTag(writer, 26, value.footer_text);
                protoAdapter2.encodeWithTag(writer, 27, value.headline);
                protoAdapter2.encodeWithTag(writer, 31, value.header_text);
                protoAdapter2.encodeWithTag(writer, 28, value.display_instrument);
                PaymentHistoryData.ActivitySection.ADAPTER.encodeWithTag(writer, 29, value.activity_section);
                PaymentHistoryData.CalloutDetailItem.ADAPTER.encodeWithTag(writer, 85, value.callout_detail_item);
                PaymentHistoryData.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 30, value.detail_rows);
                protoAdapter2.asRepeated().encodeWithTag(writer, 48, value.detail_row_phrases);
                PaymentHistoryData.StatusTreatment.ADAPTER.encodeWithTag(writer, 32, value.status_treatment);
                protoAdapter2.encodeWithTag(writer, 33, value.confirm_cancellation_text);
                ProtoAdapter protoAdapter5 = PaymentHistoryData.Icon.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 37, value.title_icon);
                protoAdapter5.encodeWithTag(writer, 38, value.subtitle_icon);
                protoAdapter5.encodeWithTag(writer, 77, value.threaded_subtitle_icon);
                ProtoAdapter protoAdapter6 = PaymentHistoryData.AmountTreatment.ADAPTER;
                protoAdapter6.encodeWithTag(writer, 45, value.amount_treatment);
                protoAdapter6.encodeWithTag(writer, 61, value.amount_treatment_activity_list);
                protoAdapter2.encodeWithTag(writer, 62, value.amount_formatted_activity_list);
                protoAdapter2.encodeWithTag(writer, 65, value.amount_formatted);
                protoAdapter2.encodeWithTag(writer, 94, value.amount_alternate_formatted);
                protoAdapter6.encodeWithTag(writer, 95, value.amount_alternate_treatment);
                PaymentHistoryData.DetailsViewContent.ADAPTER.encodeWithTag(writer, 54, value.details_view_content);
                protoAdapter2.encodeWithTag(writer, 50, value.header_subtext);
                protoAdapter3.encodeWithTag(writer, 97, value.header_subtext_as_markdown);
                AttributeRange.ADAPTER.asRepeated().encodeWithTag(writer, 99, value.header_subtext_attribute_ranges);
                protoAdapter2.encodeWithTag(writer, 51, value.more_info_sheet_status_text);
                protoAdapter2.encodeWithTag(writer, 52, value.more_info_sheet_status_subtext);
                PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodeWithTag(writer, 53, value.more_info_sheet_header_icon);
                PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(writer, 55, value.more_info_sheet_header_icon_treatment);
                PaymentHistoryReactions.ADAPTER.encodeWithTag(writer, 60, value.reactions);
                Avatar.ADAPTER.encodeWithTag(writer, 64, value.avatar);
                protoAdapter2.encodeWithTag(writer, 66, value.blockchain_transaction_id);
                protoAdapter3.encodeWithTag(writer, 67, value.is_bitcoin_transaction);
                PaymentHistoryData.SupportOptions.ADAPTER.encodeWithTag(writer, 68, value.support_options);
                PaymentHistoryData.OverlayIcon.ADAPTER.encodeWithTag(writer, 69, value.avatar_overlay_icon);
                protoAdapter2.encodeWithTag(writer, 74, value.avatar_overlay_icon_url);
                protoAdapter2.encodeWithTag(writer, 75, value.dark_theme_avatar_overlay_icon_url);
                ProtoAdapter protoAdapter7 = Color.ADAPTER;
                protoAdapter7.encodeWithTag(writer, 76, value.overlay_icon_background_color);
                PaymentHistoryData.InfoModule.ADAPTER.encodeWithTag(writer, 70, value.info_module);
                PaymentHistoryData.IconOverlayShape.ADAPTER.encodeWithTag(writer, 78, value.icon_overlay_shape);
                Timeline.ADAPTER.encodeWithTag(writer, 79, value.timeline);
                PaymentHistoryData.StackedAvatars.ADAPTER.encodeWithTag(writer, 80, value.stacked_avatars);
                protoAdapter3.encodeWithTag(writer, 81, value.show_chevron);
                protoAdapter7.encodeWithTag(writer, 82, value.subtitle_color);
                PaymentHistoryData.AssociatedPaymentsOverride.ADAPTER.encodeWithTag(writer, 83, value.associated_payment_options);
                protoAdapter2.encodeWithTag(writer, 84, value.threaded_avatar_url);
                Personalization.ADAPTER.encodeWithTag(writer, 87, value.personalization);
                protoAdapter2.encodeWithTag(writer, 89, value.primary_label);
                protoAdapter2.encodeWithTag(writer, 90, value.secondary_label);
                protoAdapter2.encodeWithTag(writer, 91, value.tertiary_label);
                ReceiptSection.ADAPTER.asRepeated().encodeWithTag(writer, 93, value.receipt_sections);
                protoAdapter3.encodeWithTag(writer, 96, value.prefer_avatar_field_display_on_ios);
                UiAvatar.ADAPTER.encodeWithTag(writer, 98, value.ui_avatar);
                protoAdapter3.encodeWithTag(writer, 100, value.is_tap_on_avatar_disabled);
                protoAdapter2.encodeWithTag(writer, 101, value.secondary_amount_formatted_activity_list);
                protoAdapter6.encodeWithTag(writer, 102, value.secondary_amount_treatment_activity_list);
                protoAdapter3.encodeWithTag(writer, 103, value.is_tap_on_row_disabled);
                protoAdapter2.encodeWithTag(writer, 104, value.accessibility_text);
                com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodeWithTag(writer, 105, value.personalization_payload);
                RetroEligibilityStatus.ADAPTER.encodeWithTag(writer, 106, value.retro_eligibility_status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentHistoryData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(4, value.square_message) + protoAdapter2.encodedSizeWithTag(39, value.support_description) + protoAdapter2.encodedSizeWithTag(3, value.long_description) + protoAdapter2.encodedSizeWithTag(2, value.short_description) + protoAdapter2.encodedSizeWithTag(63, value.preview_title) + PaymentHistoryData.ThreadedButtonOverride.ADAPTER.encodedSizeWithTag(86, value.threaded_button_override) + protoAdapter2.encodedSizeWithTag(88, value.relative_date) + protoAdapter2.encodedSizeWithTag(44, value.threaded_display_date) + protoAdapter2.encodedSizeWithTag(42, value.threaded_subtitle) + protoAdapter2.encodedSizeWithTag(41, value.threaded_title) + protoAdapter2.encodedSizeWithTag(71, value.support_accessibility_label) + protoAdapter2.encodedSizeWithTag(57, value.support_subtitle) + protoAdapter2.encodedSizeWithTag(58, value.support_short_title) + protoAdapter2.encodedSizeWithTag(56, value.support_title) + protoAdapter2.encodedSizeWithTag(34, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(9, value.notes) + protoAdapter3.encodedSizeWithTag(6, value.is_outstanding_request) + protoAdapter3.encodedSizeWithTag(5, value.is_action_required) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = PaymentHistoryButton.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(33, value.confirm_cancellation_text) + PaymentHistoryData.StatusTreatment.ADAPTER.encodedSizeWithTag(32, value.status_treatment) + protoAdapter2.asRepeated().encodedSizeWithTag(48, value.detail_row_phrases) + PaymentHistoryData.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(30, value.detail_rows) + PaymentHistoryData.CalloutDetailItem.ADAPTER.encodedSizeWithTag(85, value.callout_detail_item) + PaymentHistoryData.ActivitySection.ADAPTER.encodedSizeWithTag(29, value.activity_section) + protoAdapter2.encodedSizeWithTag(28, value.display_instrument) + protoAdapter2.encodedSizeWithTag(31, value.header_text) + protoAdapter2.encodedSizeWithTag(27, value.headline) + protoAdapter2.encodedSizeWithTag(26, value.footer_text) + protoAdapter2.encodedSizeWithTag(47, value.detail_view_status_subtitle) + protoAdapter2.encodedSizeWithTag(46, value.detail_view_status_title) + protoAdapter2.encodedSizeWithTag(25, value.status_text) + protoAdapter2.encodedSizeWithTag(24, value.transaction_id) + ProtoAdapter.INT64.encodedSizeWithTag(23, value.sort_priority) + RatePlan.ADAPTER.encodedSizeWithTag(22, value.rate_plan) + ScenarioPlanMap.ADAPTER.encodedSizeWithTag(40, value.scenario_plan_map) + ScenarioPlan.ADAPTER.encodedSizeWithTag(21, value.scenario_plan) + protoAdapter3.encodedSizeWithTag(20, value.is_email_receipt_required) + protoAdapter2.encodedSizeWithTag(19, value.response_title) + PaymentHistoryData.InlineButtonProminence.ADAPTER.encodedSizeWithTag(92, value.inline_button_prominence) + PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodedSizeWithTag(43, value.inline_button_treatment) + protoAdapter4.encodedSizeWithTag(36, value.inline_button) + protoAdapter4.asRepeated().encodedSizeWithTag(35, value.overflow_buttons) + protoAdapter4.asRepeated().encodedSizeWithTag(10, value.additional_buttons) + protoAdapter2.encodedSizeWithTag(73, value.avatar_url_to_open) + protoAdapter2.encodedSizeWithTag(72, value.url_to_open) + protoAdapter4.encodedSizeWithTag(8, value.secondary_button) + protoAdapter4.encodedSizeWithTag(7, value.primary_button) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter5 = PaymentHistoryData.Icon.ADAPTER;
                int encodedSizeWithTag4 = protoAdapter5.encodedSizeWithTag(77, value.threaded_subtitle_icon) + protoAdapter5.encodedSizeWithTag(38, value.subtitle_icon) + protoAdapter5.encodedSizeWithTag(37, value.title_icon) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter6 = PaymentHistoryData.AmountTreatment.ADAPTER;
                int encodedSizeWithTag5 = protoAdapter2.encodedSizeWithTag(75, value.dark_theme_avatar_overlay_icon_url) + protoAdapter2.encodedSizeWithTag(74, value.avatar_overlay_icon_url) + PaymentHistoryData.OverlayIcon.ADAPTER.encodedSizeWithTag(69, value.avatar_overlay_icon) + PaymentHistoryData.SupportOptions.ADAPTER.encodedSizeWithTag(68, value.support_options) + protoAdapter3.encodedSizeWithTag(67, value.is_bitcoin_transaction) + protoAdapter2.encodedSizeWithTag(66, value.blockchain_transaction_id) + Avatar.ADAPTER.encodedSizeWithTag(64, value.avatar) + PaymentHistoryReactions.ADAPTER.encodedSizeWithTag(60, value.reactions) + PaymentHistoryData.UiStatusTreatment.ADAPTER.encodedSizeWithTag(55, value.more_info_sheet_header_icon_treatment) + PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodedSizeWithTag(53, value.more_info_sheet_header_icon) + protoAdapter2.encodedSizeWithTag(52, value.more_info_sheet_status_subtext) + protoAdapter2.encodedSizeWithTag(51, value.more_info_sheet_status_text) + AttributeRange.ADAPTER.asRepeated().encodedSizeWithTag(99, value.header_subtext_attribute_ranges) + protoAdapter3.encodedSizeWithTag(97, value.header_subtext_as_markdown) + protoAdapter2.encodedSizeWithTag(50, value.header_subtext) + PaymentHistoryData.DetailsViewContent.ADAPTER.encodedSizeWithTag(54, value.details_view_content) + protoAdapter6.encodedSizeWithTag(95, value.amount_alternate_treatment) + protoAdapter2.encodedSizeWithTag(94, value.amount_alternate_formatted) + protoAdapter2.encodedSizeWithTag(65, value.amount_formatted) + protoAdapter2.encodedSizeWithTag(62, value.amount_formatted_activity_list) + protoAdapter6.encodedSizeWithTag(61, value.amount_treatment_activity_list) + protoAdapter6.encodedSizeWithTag(45, value.amount_treatment) + encodedSizeWithTag4;
                ProtoAdapter protoAdapter7 = Color.ADAPTER;
                return RetroEligibilityStatus.ADAPTER.encodedSizeWithTag(106, value.retro_eligibility_status) + com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodedSizeWithTag(105, value.personalization_payload) + protoAdapter2.encodedSizeWithTag(104, value.accessibility_text) + protoAdapter3.encodedSizeWithTag(103, value.is_tap_on_row_disabled) + protoAdapter6.encodedSizeWithTag(102, value.secondary_amount_treatment_activity_list) + protoAdapter2.encodedSizeWithTag(101, value.secondary_amount_formatted_activity_list) + protoAdapter3.encodedSizeWithTag(100, value.is_tap_on_avatar_disabled) + UiAvatar.ADAPTER.encodedSizeWithTag(98, value.ui_avatar) + protoAdapter3.encodedSizeWithTag(96, value.prefer_avatar_field_display_on_ios) + ReceiptSection.ADAPTER.asRepeated().encodedSizeWithTag(93, value.receipt_sections) + protoAdapter2.encodedSizeWithTag(91, value.tertiary_label) + protoAdapter2.encodedSizeWithTag(90, value.secondary_label) + protoAdapter2.encodedSizeWithTag(89, value.primary_label) + Personalization.ADAPTER.encodedSizeWithTag(87, value.personalization) + protoAdapter2.encodedSizeWithTag(84, value.threaded_avatar_url) + PaymentHistoryData.AssociatedPaymentsOverride.ADAPTER.encodedSizeWithTag(83, value.associated_payment_options) + protoAdapter7.encodedSizeWithTag(82, value.subtitle_color) + protoAdapter3.encodedSizeWithTag(81, value.show_chevron) + PaymentHistoryData.StackedAvatars.ADAPTER.encodedSizeWithTag(80, value.stacked_avatars) + Timeline.ADAPTER.encodedSizeWithTag(79, value.timeline) + PaymentHistoryData.IconOverlayShape.ADAPTER.encodedSizeWithTag(78, value.icon_overlay_shape) + PaymentHistoryData.InfoModule.ADAPTER.encodedSizeWithTag(70, value.info_module) + protoAdapter7.encodedSizeWithTag(76, value.overlay_icon_background_color) + encodedSizeWithTag5;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryData redact(PaymentHistoryData value) {
                value.getClass();
                PaymentHistoryData.ThreadedButtonOverride threadedButtonOverride = value.threaded_button_override;
                PaymentHistoryData.ThreadedButtonOverride threadedButtonOverride2 = threadedButtonOverride != null ? (PaymentHistoryData.ThreadedButtonOverride) PaymentHistoryData.ThreadedButtonOverride.ADAPTER.redact(threadedButtonOverride) : null;
                PaymentHistoryButton paymentHistoryButton = value.primary_button;
                PaymentHistoryButton paymentHistoryButton2 = paymentHistoryButton != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton) : null;
                PaymentHistoryButton paymentHistoryButton3 = value.secondary_button;
                PaymentHistoryButton paymentHistoryButton4 = paymentHistoryButton3 != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton3) : null;
                List<PaymentHistoryButton> list = value.additional_buttons;
                ProtoAdapter protoAdapter2 = PaymentHistoryButton.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.overflow_buttons, protoAdapter2);
                PaymentHistoryButton paymentHistoryButton5 = value.inline_button;
                PaymentHistoryButton paymentHistoryButton6 = paymentHistoryButton5 != null ? (PaymentHistoryButton) protoAdapter2.redact(paymentHistoryButton5) : null;
                ScenarioPlan scenarioPlan = value.scenario_plan;
                ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
                ScenarioPlanMap scenarioPlanMap = value.scenario_plan_map;
                ScenarioPlanMap scenarioPlanMap2 = scenarioPlanMap != null ? (ScenarioPlanMap) ScenarioPlanMap.ADAPTER.redact(scenarioPlanMap) : null;
                PaymentHistoryData.CalloutDetailItem calloutDetailItem = value.callout_detail_item;
                PaymentHistoryData.CalloutDetailItem calloutDetailItem2 = calloutDetailItem != null ? (PaymentHistoryData.CalloutDetailItem) PaymentHistoryData.CalloutDetailItem.ADAPTER.redact(calloutDetailItem) : null;
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(value.detail_rows, PaymentHistoryData.DetailRow.ADAPTER);
                EmptyList emptyList = EmptyList.INSTANCE;
                PaymentHistoryData.DetailsViewContent detailsViewContent = value.details_view_content;
                PaymentHistoryData.DetailsViewContent detailsViewContent2 = detailsViewContent != null ? (PaymentHistoryData.DetailsViewContent) PaymentHistoryData.DetailsViewContent.ADAPTER.redact(detailsViewContent) : null;
                ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(value.header_subtext_attribute_ranges, AttributeRange.ADAPTER);
                PaymentHistoryReactions paymentHistoryReactions = value.reactions;
                PaymentHistoryReactions paymentHistoryReactions2 = paymentHistoryReactions != null ? (PaymentHistoryReactions) PaymentHistoryReactions.ADAPTER.redact(paymentHistoryReactions) : null;
                Avatar avatar = value.avatar;
                PaymentHistoryData.ThreadedButtonOverride threadedButtonOverride3 = threadedButtonOverride2;
                Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
                PaymentHistoryData.SupportOptions supportOptions = value.support_options;
                Avatar avatar3 = avatar2;
                PaymentHistoryData.SupportOptions supportOptions2 = supportOptions != null ? (PaymentHistoryData.SupportOptions) PaymentHistoryData.SupportOptions.ADAPTER.redact(supportOptions) : null;
                Color color = value.overlay_icon_background_color;
                PaymentHistoryData.SupportOptions supportOptions3 = supportOptions2;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                PaymentHistoryData.InfoModule infoModule = value.info_module;
                Color color3 = color2;
                PaymentHistoryData.InfoModule infoModule2 = infoModule != null ? (PaymentHistoryData.InfoModule) PaymentHistoryData.InfoModule.ADAPTER.redact(infoModule) : null;
                Timeline timeline = value.timeline;
                PaymentHistoryData.InfoModule infoModule3 = infoModule2;
                Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
                PaymentHistoryData.StackedAvatars stackedAvatars = value.stacked_avatars;
                Timeline timeline3 = timeline2;
                PaymentHistoryData.StackedAvatars stackedAvatars2 = stackedAvatars != null ? (PaymentHistoryData.StackedAvatars) PaymentHistoryData.StackedAvatars.ADAPTER.redact(stackedAvatars) : null;
                Color color4 = value.subtitle_color;
                PaymentHistoryData.StackedAvatars stackedAvatars3 = stackedAvatars2;
                Color color5 = color4 != null ? (Color) Color.ADAPTER.redact(color4) : null;
                PaymentHistoryData.AssociatedPaymentsOverride associatedPaymentsOverride = value.associated_payment_options;
                Color color6 = color5;
                PaymentHistoryData.AssociatedPaymentsOverride associatedPaymentsOverride2 = associatedPaymentsOverride != null ? (PaymentHistoryData.AssociatedPaymentsOverride) PaymentHistoryData.AssociatedPaymentsOverride.ADAPTER.redact(associatedPaymentsOverride) : null;
                Personalization personalization = value.personalization;
                PaymentHistoryData.AssociatedPaymentsOverride associatedPaymentsOverride3 = associatedPaymentsOverride2;
                Personalization personalization2 = personalization != null ? (Personalization) Personalization.ADAPTER.redact(personalization) : null;
                ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(value.receipt_sections, ReceiptSection.ADAPTER);
                UiAvatar uiAvatar = value.ui_avatar;
                UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
                com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization3 = value.personalization_payload;
                return PaymentHistoryData.copy$default(value, threadedButtonOverride3, paymentHistoryButton2, paymentHistoryButton4, m1169redactElements, m1169redactElements2, paymentHistoryButton6, scenarioPlan2, scenarioPlanMap2, calloutDetailItem2, m1169redactElements3, emptyList, detailsViewContent2, m1169redactElements4, paymentHistoryReactions2, avatar3, supportOptions3, color3, infoModule3, timeline3, stackedAvatars3, color6, associatedPaymentsOverride3, personalization2, null, m1169redactElements5, uiAvatar2, personalization3 != null ? (com.squareup.cash.mosaic.personalization.api.v2.Personalization) com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.redact(personalization3) : null, ByteString.EMPTY, 738394880, -1979726625, -1095219111, 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentHistoryData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                RetroEligibilityStatus.ADAPTER.encodeWithTag(writer, 106, value.retro_eligibility_status);
                com.squareup.cash.mosaic.personalization.api.v2.Personalization.ADAPTER.encodeWithTag(writer, 105, value.personalization_payload);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 104, value.accessibility_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 103, value.is_tap_on_row_disabled);
                ProtoAdapter protoAdapter4 = PaymentHistoryData.AmountTreatment.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 102, value.secondary_amount_treatment_activity_list);
                protoAdapter2.encodeWithTag(writer, 101, value.secondary_amount_formatted_activity_list);
                protoAdapter3.encodeWithTag(writer, 100, value.is_tap_on_avatar_disabled);
                UiAvatar.ADAPTER.encodeWithTag(writer, 98, value.ui_avatar);
                protoAdapter3.encodeWithTag(writer, 96, value.prefer_avatar_field_display_on_ios);
                ReceiptSection.ADAPTER.asRepeated().encodeWithTag(writer, 93, value.receipt_sections);
                protoAdapter2.encodeWithTag(writer, 91, value.tertiary_label);
                protoAdapter2.encodeWithTag(writer, 90, value.secondary_label);
                protoAdapter2.encodeWithTag(writer, 89, value.primary_label);
                Personalization.ADAPTER.encodeWithTag(writer, 87, value.personalization);
                protoAdapter2.encodeWithTag(writer, 84, value.threaded_avatar_url);
                PaymentHistoryData.AssociatedPaymentsOverride.ADAPTER.encodeWithTag(writer, 83, value.associated_payment_options);
                ProtoAdapter protoAdapter5 = Color.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 82, value.subtitle_color);
                protoAdapter3.encodeWithTag(writer, 81, value.show_chevron);
                PaymentHistoryData.StackedAvatars.ADAPTER.encodeWithTag(writer, 80, value.stacked_avatars);
                Timeline.ADAPTER.encodeWithTag(writer, 79, value.timeline);
                PaymentHistoryData.IconOverlayShape.ADAPTER.encodeWithTag(writer, 78, value.icon_overlay_shape);
                PaymentHistoryData.InfoModule.ADAPTER.encodeWithTag(writer, 70, value.info_module);
                protoAdapter5.encodeWithTag(writer, 76, value.overlay_icon_background_color);
                protoAdapter2.encodeWithTag(writer, 75, value.dark_theme_avatar_overlay_icon_url);
                protoAdapter2.encodeWithTag(writer, 74, value.avatar_overlay_icon_url);
                PaymentHistoryData.OverlayIcon.ADAPTER.encodeWithTag(writer, 69, value.avatar_overlay_icon);
                PaymentHistoryData.SupportOptions.ADAPTER.encodeWithTag(writer, 68, value.support_options);
                protoAdapter3.encodeWithTag(writer, 67, value.is_bitcoin_transaction);
                protoAdapter2.encodeWithTag(writer, 66, value.blockchain_transaction_id);
                Avatar.ADAPTER.encodeWithTag(writer, 64, value.avatar);
                PaymentHistoryReactions.ADAPTER.encodeWithTag(writer, 60, value.reactions);
                PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(writer, 55, value.more_info_sheet_header_icon_treatment);
                PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodeWithTag(writer, 53, value.more_info_sheet_header_icon);
                protoAdapter2.encodeWithTag(writer, 52, value.more_info_sheet_status_subtext);
                protoAdapter2.encodeWithTag(writer, 51, value.more_info_sheet_status_text);
                AttributeRange.ADAPTER.asRepeated().encodeWithTag(writer, 99, value.header_subtext_attribute_ranges);
                protoAdapter3.encodeWithTag(writer, 97, value.header_subtext_as_markdown);
                protoAdapter2.encodeWithTag(writer, 50, value.header_subtext);
                PaymentHistoryData.DetailsViewContent.ADAPTER.encodeWithTag(writer, 54, value.details_view_content);
                protoAdapter4.encodeWithTag(writer, 95, value.amount_alternate_treatment);
                protoAdapter2.encodeWithTag(writer, 94, value.amount_alternate_formatted);
                protoAdapter2.encodeWithTag(writer, 65, value.amount_formatted);
                protoAdapter2.encodeWithTag(writer, 62, value.amount_formatted_activity_list);
                protoAdapter4.encodeWithTag(writer, 61, value.amount_treatment_activity_list);
                protoAdapter4.encodeWithTag(writer, 45, value.amount_treatment);
                ProtoAdapter protoAdapter6 = PaymentHistoryData.Icon.ADAPTER;
                protoAdapter6.encodeWithTag(writer, 77, value.threaded_subtitle_icon);
                protoAdapter6.encodeWithTag(writer, 38, value.subtitle_icon);
                protoAdapter6.encodeWithTag(writer, 37, value.title_icon);
                protoAdapter2.encodeWithTag(writer, 33, value.confirm_cancellation_text);
                PaymentHistoryData.StatusTreatment.ADAPTER.encodeWithTag(writer, 32, value.status_treatment);
                protoAdapter2.asRepeated().encodeWithTag(writer, 48, value.detail_row_phrases);
                PaymentHistoryData.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 30, value.detail_rows);
                PaymentHistoryData.CalloutDetailItem.ADAPTER.encodeWithTag(writer, 85, value.callout_detail_item);
                PaymentHistoryData.ActivitySection.ADAPTER.encodeWithTag(writer, 29, value.activity_section);
                protoAdapter2.encodeWithTag(writer, 28, value.display_instrument);
                protoAdapter2.encodeWithTag(writer, 31, value.header_text);
                protoAdapter2.encodeWithTag(writer, 27, value.headline);
                protoAdapter2.encodeWithTag(writer, 26, value.footer_text);
                protoAdapter2.encodeWithTag(writer, 47, value.detail_view_status_subtitle);
                protoAdapter2.encodeWithTag(writer, 46, value.detail_view_status_title);
                protoAdapter2.encodeWithTag(writer, 25, value.status_text);
                protoAdapter2.encodeWithTag(writer, 24, value.transaction_id);
                ProtoAdapter.INT64.encodeWithTag(writer, 23, value.sort_priority);
                RatePlan.ADAPTER.encodeWithTag(writer, 22, value.rate_plan);
                ScenarioPlanMap.ADAPTER.encodeWithTag(writer, 40, value.scenario_plan_map);
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 21, value.scenario_plan);
                protoAdapter3.encodeWithTag(writer, 20, value.is_email_receipt_required);
                protoAdapter2.encodeWithTag(writer, 19, value.response_title);
                PaymentHistoryData.InlineButtonProminence.ADAPTER.encodeWithTag(writer, 92, value.inline_button_prominence);
                PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(writer, 43, value.inline_button_treatment);
                ProtoAdapter protoAdapter7 = PaymentHistoryButton.ADAPTER;
                protoAdapter7.encodeWithTag(writer, 36, value.inline_button);
                protoAdapter7.asRepeated().encodeWithTag(writer, 35, value.overflow_buttons);
                protoAdapter7.asRepeated().encodeWithTag(writer, 10, value.additional_buttons);
                protoAdapter2.encodeWithTag(writer, 73, value.avatar_url_to_open);
                protoAdapter2.encodeWithTag(writer, 72, value.url_to_open);
                protoAdapter7.encodeWithTag(writer, 8, value.secondary_button);
                protoAdapter7.encodeWithTag(writer, 7, value.primary_button);
                protoAdapter2.encodeWithTag(writer, 9, value.notes);
                protoAdapter3.encodeWithTag(writer, 6, value.is_outstanding_request);
                protoAdapter3.encodeWithTag(writer, 5, value.is_action_required);
                protoAdapter2.encodeWithTag(writer, 4, value.square_message);
                protoAdapter2.encodeWithTag(writer, 39, value.support_description);
                protoAdapter2.encodeWithTag(writer, 3, value.long_description);
                protoAdapter2.encodeWithTag(writer, 2, value.short_description);
                protoAdapter2.encodeWithTag(writer, 63, value.preview_title);
                PaymentHistoryData.ThreadedButtonOverride.ADAPTER.encodeWithTag(writer, 86, value.threaded_button_override);
                protoAdapter2.encodeWithTag(writer, 88, value.relative_date);
                protoAdapter2.encodeWithTag(writer, 44, value.threaded_display_date);
                protoAdapter2.encodeWithTag(writer, 42, value.threaded_subtitle);
                protoAdapter2.encodeWithTag(writer, 41, value.threaded_title);
                protoAdapter2.encodeWithTag(writer, 71, value.support_accessibility_label);
                protoAdapter2.encodeWithTag(writer, 57, value.support_subtitle);
                protoAdapter2.encodeWithTag(writer, 58, value.support_short_title);
                protoAdapter2.encodeWithTag(writer, 56, value.support_title);
                protoAdapter2.encodeWithTag(writer, 34, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ThreadedButtonOverride threadedButtonOverride, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, String str16, PaymentHistoryButton paymentHistoryButton, PaymentHistoryButton paymentHistoryButton2, String str17, String str18, List list, List list2, PaymentHistoryButton paymentHistoryButton3, InlineButtonTreatment inlineButtonTreatment, InlineButtonProminence inlineButtonProminence, String str19, Boolean bool3, ScenarioPlan scenarioPlan, ScenarioPlanMap scenarioPlanMap, RatePlan ratePlan, Long l, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, ActivitySection activitySection, CalloutDetailItem calloutDetailItem, List list3, List list4, StatusTreatment statusTreatment, String str28, Icon icon, Icon icon2, Icon icon3, AmountTreatment amountTreatment, AmountTreatment amountTreatment2, String str29, String str30, String str31, AmountTreatment amountTreatment3, DetailsViewContent detailsViewContent, String str32, Boolean bool4, List list5, String str33, String str34, MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon, UiStatusTreatment uiStatusTreatment, PaymentHistoryReactions paymentHistoryReactions, Avatar avatar, String str35, Boolean bool5, SupportOptions supportOptions, OverlayIcon overlayIcon, String str36, String str37, Color color, InfoModule infoModule, IconOverlayShape iconOverlayShape, Timeline timeline, StackedAvatars stackedAvatars, Boolean bool6, Color color2, AssociatedPaymentsOverride associatedPaymentsOverride, String str38, Personalization personalization, String str39, String str40, String str41, List list6, Boolean bool7, UiAvatar uiAvatar, Boolean bool8, String str42, AmountTreatment amountTreatment4, Boolean bool9, String str43, com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2, RetroEligibilityStatus retroEligibilityStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.support_title = str3;
        this.support_short_title = str4;
        this.support_subtitle = str5;
        this.support_accessibility_label = str6;
        this.threaded_title = str7;
        this.threaded_subtitle = str8;
        this.threaded_display_date = str9;
        this.relative_date = str10;
        this.threaded_button_override = threadedButtonOverride;
        this.preview_title = str11;
        this.short_description = str12;
        this.long_description = str13;
        this.support_description = str14;
        this.square_message = str15;
        this.is_action_required = bool;
        this.is_outstanding_request = bool2;
        this.notes = str16;
        this.primary_button = paymentHistoryButton;
        this.secondary_button = paymentHistoryButton2;
        this.url_to_open = str17;
        this.avatar_url_to_open = str18;
        this.inline_button = paymentHistoryButton3;
        this.inline_button_treatment = inlineButtonTreatment;
        this.inline_button_prominence = inlineButtonProminence;
        this.response_title = str19;
        this.is_email_receipt_required = bool3;
        this.scenario_plan = scenarioPlan;
        this.scenario_plan_map = scenarioPlanMap;
        this.rate_plan = ratePlan;
        this.sort_priority = l;
        this.transaction_id = str20;
        this.status_text = str21;
        this.detail_view_status_title = str22;
        this.detail_view_status_subtitle = str23;
        this.footer_text = str24;
        this.headline = str25;
        this.header_text = str26;
        this.display_instrument = str27;
        this.activity_section = activitySection;
        this.callout_detail_item = calloutDetailItem;
        this.status_treatment = statusTreatment;
        this.confirm_cancellation_text = str28;
        this.title_icon = icon;
        this.subtitle_icon = icon2;
        this.threaded_subtitle_icon = icon3;
        this.amount_treatment = amountTreatment;
        this.amount_treatment_activity_list = amountTreatment2;
        this.amount_formatted_activity_list = str29;
        this.amount_formatted = str30;
        this.amount_alternate_formatted = str31;
        this.amount_alternate_treatment = amountTreatment3;
        this.details_view_content = detailsViewContent;
        this.header_subtext = str32;
        this.header_subtext_as_markdown = bool4;
        this.more_info_sheet_status_text = str33;
        this.more_info_sheet_status_subtext = str34;
        this.more_info_sheet_header_icon = moreInfoSheetHeaderIcon;
        this.more_info_sheet_header_icon_treatment = uiStatusTreatment;
        this.reactions = paymentHistoryReactions;
        this.avatar = avatar;
        this.blockchain_transaction_id = str35;
        this.is_bitcoin_transaction = bool5;
        this.support_options = supportOptions;
        this.avatar_overlay_icon = overlayIcon;
        this.avatar_overlay_icon_url = str36;
        this.dark_theme_avatar_overlay_icon_url = str37;
        this.overlay_icon_background_color = color;
        this.info_module = infoModule;
        this.icon_overlay_shape = iconOverlayShape;
        this.timeline = timeline;
        this.stacked_avatars = stackedAvatars;
        this.show_chevron = bool6;
        this.subtitle_color = color2;
        this.associated_payment_options = associatedPaymentsOverride;
        this.threaded_avatar_url = str38;
        this.personalization = personalization;
        this.primary_label = str39;
        this.secondary_label = str40;
        this.tertiary_label = str41;
        this.prefer_avatar_field_display_on_ios = bool7;
        this.ui_avatar = uiAvatar;
        this.is_tap_on_avatar_disabled = bool8;
        this.secondary_amount_formatted_activity_list = str42;
        this.secondary_amount_treatment_activity_list = amountTreatment4;
        this.is_tap_on_row_disabled = bool9;
        this.accessibility_text = str43;
        this.personalization_payload = personalization2;
        this.retro_eligibility_status = retroEligibilityStatus;
        this.additional_buttons = TransactorKt.immutableCopyOf("additional_buttons", list);
        this.overflow_buttons = TransactorKt.immutableCopyOf("overflow_buttons", list2);
        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list3);
        this.detail_row_phrases = TransactorKt.immutableCopyOf("detail_row_phrases", list4);
        this.header_subtext_attribute_ranges = TransactorKt.immutableCopyOf("header_subtext_attribute_ranges", list5);
        this.receipt_sections = TransactorKt.immutableCopyOf("receipt_sections", list6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PaymentHistoryData copy$default(PaymentHistoryData paymentHistoryData, ThreadedButtonOverride threadedButtonOverride, PaymentHistoryButton paymentHistoryButton, PaymentHistoryButton paymentHistoryButton2, ArrayList arrayList, ArrayList arrayList2, PaymentHistoryButton paymentHistoryButton3, ScenarioPlan scenarioPlan, ScenarioPlanMap scenarioPlanMap, CalloutDetailItem calloutDetailItem, ArrayList arrayList3, EmptyList emptyList, DetailsViewContent detailsViewContent, ArrayList arrayList4, PaymentHistoryReactions paymentHistoryReactions, Avatar avatar, SupportOptions supportOptions, Color color, InfoModule infoModule, Timeline timeline, StackedAvatars stackedAvatars, Color color2, AssociatedPaymentsOverride associatedPaymentsOverride, Personalization personalization, String str, ArrayList arrayList5, UiAvatar uiAvatar, com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2, ByteString byteString, int i, int i2, int i3, int i4) {
        int i5;
        PaymentHistoryButton paymentHistoryButton4;
        InlineButtonProminence inlineButtonProminence;
        String str2;
        Boolean bool;
        ScenarioPlan scenarioPlan2;
        String str3;
        String str4;
        AmountTreatment amountTreatment;
        DetailsViewContent detailsViewContent2;
        String str5 = (i & 1) != 0 ? paymentHistoryData.title : null;
        String str6 = (i & 2) != 0 ? paymentHistoryData.subtitle : null;
        String str7 = (i & 4) != 0 ? paymentHistoryData.support_title : null;
        String str8 = (i & 8) != 0 ? paymentHistoryData.support_short_title : null;
        String str9 = (i & 16) != 0 ? paymentHistoryData.support_subtitle : null;
        String str10 = (i & 32) != 0 ? paymentHistoryData.support_accessibility_label : null;
        String str11 = (i & 64) != 0 ? paymentHistoryData.threaded_title : null;
        String str12 = (i & 128) != 0 ? paymentHistoryData.threaded_subtitle : null;
        String str13 = paymentHistoryData.threaded_display_date;
        String str14 = paymentHistoryData.relative_date;
        ThreadedButtonOverride threadedButtonOverride2 = (i & 1024) != 0 ? paymentHistoryData.threaded_button_override : threadedButtonOverride;
        String str15 = (i & 2048) != 0 ? paymentHistoryData.preview_title : null;
        String str16 = (i & 4096) != 0 ? paymentHistoryData.short_description : null;
        String str17 = (i & PKIFailureInfo.certRevoked) != 0 ? paymentHistoryData.long_description : null;
        String str18 = (i & 16384) != 0 ? paymentHistoryData.support_description : null;
        String str19 = (i & 32768) != 0 ? paymentHistoryData.square_message : null;
        Boolean bool2 = paymentHistoryData.is_action_required;
        Boolean bool3 = paymentHistoryData.is_outstanding_request;
        String str20 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? paymentHistoryData.notes : null;
        if ((i & PKIFailureInfo.signerNotTrusted) != 0) {
            i5 = 524288;
            paymentHistoryButton4 = paymentHistoryData.primary_button;
        } else {
            i5 = 524288;
            paymentHistoryButton4 = paymentHistoryButton;
        }
        PaymentHistoryButton paymentHistoryButton5 = (i & PKIFailureInfo.badCertTemplate) != 0 ? paymentHistoryData.secondary_button : paymentHistoryButton2;
        String str21 = (i & PKIFailureInfo.badSenderNonce) != 0 ? paymentHistoryData.url_to_open : null;
        String str22 = (i & 4194304) != 0 ? paymentHistoryData.avatar_url_to_open : null;
        List list = (i & 8388608) != 0 ? paymentHistoryData.additional_buttons : arrayList;
        List list2 = (i & 16777216) != 0 ? paymentHistoryData.overflow_buttons : arrayList2;
        PaymentHistoryButton paymentHistoryButton6 = (i & 33554432) != 0 ? paymentHistoryData.inline_button : paymentHistoryButton3;
        InlineButtonTreatment inlineButtonTreatment = paymentHistoryData.inline_button_treatment;
        InlineButtonProminence inlineButtonProminence2 = paymentHistoryData.inline_button_prominence;
        if ((i & 268435456) != 0) {
            inlineButtonProminence = inlineButtonProminence2;
            str2 = paymentHistoryData.response_title;
        } else {
            inlineButtonProminence = inlineButtonProminence2;
            str2 = null;
        }
        Boolean bool4 = paymentHistoryData.is_email_receipt_required;
        if ((i & 1073741824) != 0) {
            bool = bool4;
            scenarioPlan2 = paymentHistoryData.scenario_plan;
        } else {
            bool = bool4;
            scenarioPlan2 = scenarioPlan;
        }
        ScenarioPlan scenarioPlan3 = scenarioPlan2;
        ScenarioPlanMap scenarioPlanMap2 = (i & PKIFailureInfo.systemUnavail) != 0 ? paymentHistoryData.scenario_plan_map : scenarioPlanMap;
        RatePlan ratePlan = paymentHistoryData.rate_plan;
        Long l = paymentHistoryData.sort_priority;
        String str23 = paymentHistoryData.transaction_id;
        String str24 = paymentHistoryData.status_text;
        String str25 = paymentHistoryData.detail_view_status_title;
        if ((i2 & 32) != 0) {
            str3 = str25;
            str4 = paymentHistoryData.detail_view_status_subtitle;
        } else {
            str3 = str25;
            str4 = null;
        }
        String str26 = paymentHistoryData.footer_text;
        String str27 = paymentHistoryData.headline;
        String str28 = (i2 & 256) != 0 ? paymentHistoryData.header_text : null;
        String str29 = (i2 & 512) != 0 ? paymentHistoryData.display_instrument : null;
        ActivitySection activitySection = paymentHistoryData.activity_section;
        CalloutDetailItem calloutDetailItem2 = (i2 & 2048) != 0 ? paymentHistoryData.callout_detail_item : calloutDetailItem;
        List list3 = (i2 & 4096) != 0 ? paymentHistoryData.detail_rows : arrayList3;
        List list4 = (i2 & PKIFailureInfo.certRevoked) != 0 ? paymentHistoryData.detail_row_phrases : emptyList;
        StatusTreatment statusTreatment = paymentHistoryData.status_treatment;
        String str30 = paymentHistoryData.confirm_cancellation_text;
        Icon icon = paymentHistoryData.title_icon;
        Icon icon2 = paymentHistoryData.subtitle_icon;
        Icon icon3 = paymentHistoryData.threaded_subtitle_icon;
        AmountTreatment amountTreatment2 = paymentHistoryData.amount_treatment;
        AmountTreatment amountTreatment3 = paymentHistoryData.amount_treatment_activity_list;
        String str31 = paymentHistoryData.amount_formatted_activity_list;
        String str32 = paymentHistoryData.amount_formatted;
        String str33 = paymentHistoryData.amount_alternate_formatted;
        AmountTreatment amountTreatment4 = paymentHistoryData.amount_alternate_treatment;
        if ((i2 & 33554432) != 0) {
            amountTreatment = amountTreatment4;
            detailsViewContent2 = paymentHistoryData.details_view_content;
        } else {
            amountTreatment = amountTreatment4;
            detailsViewContent2 = detailsViewContent;
        }
        String str34 = (67108864 & i2) != 0 ? paymentHistoryData.header_subtext : null;
        Boolean bool5 = paymentHistoryData.header_subtext_as_markdown;
        List list5 = (i2 & 268435456) != 0 ? paymentHistoryData.header_subtext_attribute_ranges : arrayList4;
        String str35 = (536870912 & i2) != 0 ? paymentHistoryData.more_info_sheet_status_text : null;
        String str36 = (i2 & 1073741824) != 0 ? paymentHistoryData.more_info_sheet_status_subtext : null;
        MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = paymentHistoryData.more_info_sheet_header_icon;
        UiStatusTreatment uiStatusTreatment = paymentHistoryData.more_info_sheet_header_icon_treatment;
        PaymentHistoryReactions paymentHistoryReactions2 = (i3 & 2) != 0 ? paymentHistoryData.reactions : paymentHistoryReactions;
        Avatar avatar2 = (i3 & 4) != 0 ? paymentHistoryData.avatar : avatar;
        String str37 = paymentHistoryData.blockchain_transaction_id;
        Boolean bool6 = paymentHistoryData.is_bitcoin_transaction;
        SupportOptions supportOptions2 = (i3 & 32) != 0 ? paymentHistoryData.support_options : supportOptions;
        OverlayIcon overlayIcon = paymentHistoryData.avatar_overlay_icon;
        String str38 = (i3 & 128) != 0 ? paymentHistoryData.avatar_overlay_icon_url : null;
        String str39 = (i3 & 256) != 0 ? paymentHistoryData.dark_theme_avatar_overlay_icon_url : null;
        Color color3 = (i3 & 512) != 0 ? paymentHistoryData.overlay_icon_background_color : color;
        InfoModule infoModule2 = (i3 & 1024) != 0 ? paymentHistoryData.info_module : infoModule;
        IconOverlayShape iconOverlayShape = paymentHistoryData.icon_overlay_shape;
        Timeline timeline2 = (i3 & 4096) != 0 ? paymentHistoryData.timeline : timeline;
        StackedAvatars stackedAvatars2 = (i3 & PKIFailureInfo.certRevoked) != 0 ? paymentHistoryData.stacked_avatars : stackedAvatars;
        Boolean bool7 = paymentHistoryData.show_chevron;
        Color color4 = (i3 & 32768) != 0 ? paymentHistoryData.subtitle_color : color2;
        AssociatedPaymentsOverride associatedPaymentsOverride2 = (65536 & i3) != 0 ? paymentHistoryData.associated_payment_options : associatedPaymentsOverride;
        String str40 = (131072 & i3) != 0 ? paymentHistoryData.threaded_avatar_url : null;
        Personalization personalization3 = (i3 & PKIFailureInfo.transactionIdInUse) != 0 ? paymentHistoryData.personalization : personalization;
        String str41 = (i3 & i5) != 0 ? paymentHistoryData.primary_label : str;
        String str42 = paymentHistoryData.secondary_label;
        String str43 = paymentHistoryData.tertiary_label;
        List list6 = (i3 & 4194304) != 0 ? paymentHistoryData.receipt_sections : arrayList5;
        Boolean bool8 = paymentHistoryData.prefer_avatar_field_display_on_ios;
        Boolean bool9 = paymentHistoryData.is_tap_on_avatar_disabled;
        String str44 = paymentHistoryData.secondary_amount_formatted_activity_list;
        AmountTreatment amountTreatment5 = paymentHistoryData.secondary_amount_treatment_activity_list;
        Boolean bool10 = paymentHistoryData.is_tap_on_row_disabled;
        String str45 = paymentHistoryData.accessibility_text;
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization4 = (i3 & 1073741824) != 0 ? paymentHistoryData.personalization_payload : personalization2;
        RetroEligibilityStatus retroEligibilityStatus = paymentHistoryData.retro_eligibility_status;
        ByteString unknownFields = (i4 & 1) != 0 ? paymentHistoryData.unknownFields() : byteString;
        paymentHistoryData.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        unknownFields.getClass();
        return new PaymentHistoryData(str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, threadedButtonOverride2, str15, str16, str17, str18, str19, bool2, bool3, str20, paymentHistoryButton4, paymentHistoryButton5, str21, str22, list, list2, paymentHistoryButton6, inlineButtonTreatment, inlineButtonProminence, str2, bool, scenarioPlan3, scenarioPlanMap2, ratePlan, l, str23, str24, str3, str4, str26, str27, str28, str29, activitySection, calloutDetailItem2, list3, list4, statusTreatment, str30, icon, icon2, icon3, amountTreatment2, amountTreatment3, str31, str32, str33, amountTreatment, detailsViewContent2, str34, bool5, list5, str35, str36, moreInfoSheetHeaderIcon, uiStatusTreatment, paymentHistoryReactions2, avatar2, str37, bool6, supportOptions2, overlayIcon, str38, str39, color3, infoModule2, iconOverlayShape, timeline2, stackedAvatars2, bool7, color4, associatedPaymentsOverride2, str40, personalization3, str41, str42, str43, list6, bool8, uiAvatar, bool9, str44, amountTreatment5, bool10, str45, personalization4, retroEligibilityStatus, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryData)) {
            return false;
        }
        PaymentHistoryData paymentHistoryData = (PaymentHistoryData) obj;
        return Intrinsics.areEqual(unknownFields(), paymentHistoryData.unknownFields()) && Intrinsics.areEqual(this.title, paymentHistoryData.title) && Intrinsics.areEqual(this.subtitle, paymentHistoryData.subtitle) && Intrinsics.areEqual(this.support_title, paymentHistoryData.support_title) && Intrinsics.areEqual(this.support_short_title, paymentHistoryData.support_short_title) && Intrinsics.areEqual(this.support_subtitle, paymentHistoryData.support_subtitle) && Intrinsics.areEqual(this.support_accessibility_label, paymentHistoryData.support_accessibility_label) && Intrinsics.areEqual(this.threaded_title, paymentHistoryData.threaded_title) && Intrinsics.areEqual(this.threaded_subtitle, paymentHistoryData.threaded_subtitle) && Intrinsics.areEqual(this.threaded_display_date, paymentHistoryData.threaded_display_date) && Intrinsics.areEqual(this.relative_date, paymentHistoryData.relative_date) && Intrinsics.areEqual(this.threaded_button_override, paymentHistoryData.threaded_button_override) && Intrinsics.areEqual(this.preview_title, paymentHistoryData.preview_title) && Intrinsics.areEqual(this.short_description, paymentHistoryData.short_description) && Intrinsics.areEqual(this.long_description, paymentHistoryData.long_description) && Intrinsics.areEqual(this.support_description, paymentHistoryData.support_description) && Intrinsics.areEqual(this.square_message, paymentHistoryData.square_message) && Intrinsics.areEqual(this.is_action_required, paymentHistoryData.is_action_required) && Intrinsics.areEqual(this.is_outstanding_request, paymentHistoryData.is_outstanding_request) && Intrinsics.areEqual(this.notes, paymentHistoryData.notes) && Intrinsics.areEqual(this.primary_button, paymentHistoryData.primary_button) && Intrinsics.areEqual(this.secondary_button, paymentHistoryData.secondary_button) && Intrinsics.areEqual(this.url_to_open, paymentHistoryData.url_to_open) && Intrinsics.areEqual(this.avatar_url_to_open, paymentHistoryData.avatar_url_to_open) && Intrinsics.areEqual(this.additional_buttons, paymentHistoryData.additional_buttons) && Intrinsics.areEqual(this.overflow_buttons, paymentHistoryData.overflow_buttons) && Intrinsics.areEqual(this.inline_button, paymentHistoryData.inline_button) && this.inline_button_treatment == paymentHistoryData.inline_button_treatment && this.inline_button_prominence == paymentHistoryData.inline_button_prominence && Intrinsics.areEqual(this.response_title, paymentHistoryData.response_title) && Intrinsics.areEqual(this.is_email_receipt_required, paymentHistoryData.is_email_receipt_required) && Intrinsics.areEqual(this.scenario_plan, paymentHistoryData.scenario_plan) && Intrinsics.areEqual(this.scenario_plan_map, paymentHistoryData.scenario_plan_map) && this.rate_plan == paymentHistoryData.rate_plan && Intrinsics.areEqual(this.sort_priority, paymentHistoryData.sort_priority) && Intrinsics.areEqual(this.transaction_id, paymentHistoryData.transaction_id) && Intrinsics.areEqual(this.status_text, paymentHistoryData.status_text) && Intrinsics.areEqual(this.detail_view_status_title, paymentHistoryData.detail_view_status_title) && Intrinsics.areEqual(this.detail_view_status_subtitle, paymentHistoryData.detail_view_status_subtitle) && Intrinsics.areEqual(this.footer_text, paymentHistoryData.footer_text) && Intrinsics.areEqual(this.headline, paymentHistoryData.headline) && Intrinsics.areEqual(this.header_text, paymentHistoryData.header_text) && Intrinsics.areEqual(this.display_instrument, paymentHistoryData.display_instrument) && this.activity_section == paymentHistoryData.activity_section && Intrinsics.areEqual(this.callout_detail_item, paymentHistoryData.callout_detail_item) && Intrinsics.areEqual(this.detail_rows, paymentHistoryData.detail_rows) && Intrinsics.areEqual(this.detail_row_phrases, paymentHistoryData.detail_row_phrases) && this.status_treatment == paymentHistoryData.status_treatment && Intrinsics.areEqual(this.confirm_cancellation_text, paymentHistoryData.confirm_cancellation_text) && this.title_icon == paymentHistoryData.title_icon && this.subtitle_icon == paymentHistoryData.subtitle_icon && this.threaded_subtitle_icon == paymentHistoryData.threaded_subtitle_icon && this.amount_treatment == paymentHistoryData.amount_treatment && this.amount_treatment_activity_list == paymentHistoryData.amount_treatment_activity_list && Intrinsics.areEqual(this.amount_formatted_activity_list, paymentHistoryData.amount_formatted_activity_list) && Intrinsics.areEqual(this.amount_formatted, paymentHistoryData.amount_formatted) && Intrinsics.areEqual(this.amount_alternate_formatted, paymentHistoryData.amount_alternate_formatted) && this.amount_alternate_treatment == paymentHistoryData.amount_alternate_treatment && Intrinsics.areEqual(this.details_view_content, paymentHistoryData.details_view_content) && Intrinsics.areEqual(this.header_subtext, paymentHistoryData.header_subtext) && Intrinsics.areEqual(this.header_subtext_as_markdown, paymentHistoryData.header_subtext_as_markdown) && Intrinsics.areEqual(this.header_subtext_attribute_ranges, paymentHistoryData.header_subtext_attribute_ranges) && Intrinsics.areEqual(this.more_info_sheet_status_text, paymentHistoryData.more_info_sheet_status_text) && Intrinsics.areEqual(this.more_info_sheet_status_subtext, paymentHistoryData.more_info_sheet_status_subtext) && this.more_info_sheet_header_icon == paymentHistoryData.more_info_sheet_header_icon && this.more_info_sheet_header_icon_treatment == paymentHistoryData.more_info_sheet_header_icon_treatment && Intrinsics.areEqual(this.reactions, paymentHistoryData.reactions) && Intrinsics.areEqual(this.avatar, paymentHistoryData.avatar) && Intrinsics.areEqual(this.blockchain_transaction_id, paymentHistoryData.blockchain_transaction_id) && Intrinsics.areEqual(this.is_bitcoin_transaction, paymentHistoryData.is_bitcoin_transaction) && Intrinsics.areEqual(this.support_options, paymentHistoryData.support_options) && this.avatar_overlay_icon == paymentHistoryData.avatar_overlay_icon && Intrinsics.areEqual(this.avatar_overlay_icon_url, paymentHistoryData.avatar_overlay_icon_url) && Intrinsics.areEqual(this.dark_theme_avatar_overlay_icon_url, paymentHistoryData.dark_theme_avatar_overlay_icon_url) && Intrinsics.areEqual(this.overlay_icon_background_color, paymentHistoryData.overlay_icon_background_color) && Intrinsics.areEqual(this.info_module, paymentHistoryData.info_module) && this.icon_overlay_shape == paymentHistoryData.icon_overlay_shape && Intrinsics.areEqual(this.timeline, paymentHistoryData.timeline) && Intrinsics.areEqual(this.stacked_avatars, paymentHistoryData.stacked_avatars) && Intrinsics.areEqual(this.show_chevron, paymentHistoryData.show_chevron) && Intrinsics.areEqual(this.subtitle_color, paymentHistoryData.subtitle_color) && Intrinsics.areEqual(this.associated_payment_options, paymentHistoryData.associated_payment_options) && Intrinsics.areEqual(this.threaded_avatar_url, paymentHistoryData.threaded_avatar_url) && Intrinsics.areEqual(this.personalization, paymentHistoryData.personalization) && Intrinsics.areEqual(this.primary_label, paymentHistoryData.primary_label) && Intrinsics.areEqual(this.secondary_label, paymentHistoryData.secondary_label) && Intrinsics.areEqual(this.tertiary_label, paymentHistoryData.tertiary_label) && Intrinsics.areEqual(this.receipt_sections, paymentHistoryData.receipt_sections) && Intrinsics.areEqual(this.prefer_avatar_field_display_on_ios, paymentHistoryData.prefer_avatar_field_display_on_ios) && Intrinsics.areEqual(this.ui_avatar, paymentHistoryData.ui_avatar) && Intrinsics.areEqual(this.is_tap_on_avatar_disabled, paymentHistoryData.is_tap_on_avatar_disabled) && Intrinsics.areEqual(this.secondary_amount_formatted_activity_list, paymentHistoryData.secondary_amount_formatted_activity_list) && this.secondary_amount_treatment_activity_list == paymentHistoryData.secondary_amount_treatment_activity_list && Intrinsics.areEqual(this.is_tap_on_row_disabled, paymentHistoryData.is_tap_on_row_disabled) && Intrinsics.areEqual(this.accessibility_text, paymentHistoryData.accessibility_text) && Intrinsics.areEqual(this.personalization_payload, paymentHistoryData.personalization_payload) && this.retro_eligibility_status == paymentHistoryData.retro_eligibility_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.support_title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.support_short_title;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.support_subtitle;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.support_accessibility_label;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.threaded_title;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.threaded_subtitle;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.threaded_display_date;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.relative_date;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        ThreadedButtonOverride threadedButtonOverride = this.threaded_button_override;
        int hashCode12 = (hashCode11 + (threadedButtonOverride != null ? threadedButtonOverride.hashCode() : 0)) * 37;
        String str11 = this.preview_title;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.short_description;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.long_description;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.support_description;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.square_message;
        int hashCode17 = (hashCode16 + (str15 != null ? str15.hashCode() : 0)) * 37;
        Boolean bool = this.is_action_required;
        int hashCode18 = (hashCode17 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_outstanding_request;
        int hashCode19 = (hashCode18 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str16 = this.notes;
        int hashCode20 = (hashCode19 + (str16 != null ? str16.hashCode() : 0)) * 37;
        PaymentHistoryButton paymentHistoryButton = this.primary_button;
        int hashCode21 = (hashCode20 + (paymentHistoryButton != null ? paymentHistoryButton.hashCode() : 0)) * 37;
        PaymentHistoryButton paymentHistoryButton2 = this.secondary_button;
        int hashCode22 = (hashCode21 + (paymentHistoryButton2 != null ? paymentHistoryButton2.hashCode() : 0)) * 37;
        String str17 = this.url_to_open;
        int hashCode23 = (hashCode22 + (str17 != null ? str17.hashCode() : 0)) * 37;
        String str18 = this.avatar_url_to_open;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode23 + (str18 != null ? str18.hashCode() : 0)) * 37, 37, this.additional_buttons), 37, this.overflow_buttons);
        PaymentHistoryButton paymentHistoryButton3 = this.inline_button;
        int hashCode24 = (m + (paymentHistoryButton3 != null ? paymentHistoryButton3.hashCode() : 0)) * 37;
        InlineButtonTreatment inlineButtonTreatment = this.inline_button_treatment;
        int hashCode25 = (hashCode24 + (inlineButtonTreatment != null ? inlineButtonTreatment.hashCode() : 0)) * 37;
        InlineButtonProminence inlineButtonProminence = this.inline_button_prominence;
        int hashCode26 = (hashCode25 + (inlineButtonProminence != null ? inlineButtonProminence.hashCode() : 0)) * 37;
        String str19 = this.response_title;
        int hashCode27 = (hashCode26 + (str19 != null ? str19.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_email_receipt_required;
        int hashCode28 = (hashCode27 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode29 = (hashCode28 + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        int hashCode30 = (hashCode29 + (scenarioPlanMap != null ? scenarioPlanMap.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode31 = (hashCode30 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        Long l = this.sort_priority;
        int hashCode32 = (hashCode31 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str20 = this.transaction_id;
        int hashCode33 = (hashCode32 + (str20 != null ? str20.hashCode() : 0)) * 37;
        String str21 = this.status_text;
        int hashCode34 = (hashCode33 + (str21 != null ? str21.hashCode() : 0)) * 37;
        String str22 = this.detail_view_status_title;
        int hashCode35 = (hashCode34 + (str22 != null ? str22.hashCode() : 0)) * 37;
        String str23 = this.detail_view_status_subtitle;
        int hashCode36 = (hashCode35 + (str23 != null ? str23.hashCode() : 0)) * 37;
        String str24 = this.footer_text;
        int hashCode37 = (hashCode36 + (str24 != null ? str24.hashCode() : 0)) * 37;
        String str25 = this.headline;
        int hashCode38 = (hashCode37 + (str25 != null ? str25.hashCode() : 0)) * 37;
        String str26 = this.header_text;
        int hashCode39 = (hashCode38 + (str26 != null ? str26.hashCode() : 0)) * 37;
        String str27 = this.display_instrument;
        int hashCode40 = (hashCode39 + (str27 != null ? str27.hashCode() : 0)) * 37;
        ActivitySection activitySection = this.activity_section;
        int hashCode41 = (hashCode40 + (activitySection != null ? activitySection.hashCode() : 0)) * 37;
        CalloutDetailItem calloutDetailItem = this.callout_detail_item;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode41 + (calloutDetailItem != null ? calloutDetailItem.hashCode() : 0)) * 37, 37, this.detail_rows), 37, this.detail_row_phrases);
        StatusTreatment statusTreatment = this.status_treatment;
        int hashCode42 = (m2 + (statusTreatment != null ? statusTreatment.hashCode() : 0)) * 37;
        String str28 = this.confirm_cancellation_text;
        int hashCode43 = (hashCode42 + (str28 != null ? str28.hashCode() : 0)) * 37;
        Icon icon = this.title_icon;
        int hashCode44 = (hashCode43 + (icon != null ? icon.hashCode() : 0)) * 37;
        Icon icon2 = this.subtitle_icon;
        int hashCode45 = (hashCode44 + (icon2 != null ? icon2.hashCode() : 0)) * 37;
        Icon icon3 = this.threaded_subtitle_icon;
        int hashCode46 = (hashCode45 + (icon3 != null ? icon3.hashCode() : 0)) * 37;
        AmountTreatment amountTreatment = this.amount_treatment;
        int hashCode47 = (hashCode46 + (amountTreatment != null ? amountTreatment.hashCode() : 0)) * 37;
        AmountTreatment amountTreatment2 = this.amount_treatment_activity_list;
        int hashCode48 = (hashCode47 + (amountTreatment2 != null ? amountTreatment2.hashCode() : 0)) * 37;
        String str29 = this.amount_formatted_activity_list;
        int hashCode49 = (hashCode48 + (str29 != null ? str29.hashCode() : 0)) * 37;
        String str30 = this.amount_formatted;
        int hashCode50 = (hashCode49 + (str30 != null ? str30.hashCode() : 0)) * 37;
        String str31 = this.amount_alternate_formatted;
        int hashCode51 = (hashCode50 + (str31 != null ? str31.hashCode() : 0)) * 37;
        AmountTreatment amountTreatment3 = this.amount_alternate_treatment;
        int hashCode52 = (hashCode51 + (amountTreatment3 != null ? amountTreatment3.hashCode() : 0)) * 37;
        DetailsViewContent detailsViewContent = this.details_view_content;
        int hashCode53 = (hashCode52 + (detailsViewContent != null ? detailsViewContent.hashCode() : 0)) * 37;
        String str32 = this.header_subtext;
        int hashCode54 = (hashCode53 + (str32 != null ? str32.hashCode() : 0)) * 37;
        Boolean bool4 = this.header_subtext_as_markdown;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode54 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37, 37, this.header_subtext_attribute_ranges);
        String str33 = this.more_info_sheet_status_text;
        int hashCode55 = (m3 + (str33 != null ? str33.hashCode() : 0)) * 37;
        String str34 = this.more_info_sheet_status_subtext;
        int hashCode56 = (hashCode55 + (str34 != null ? str34.hashCode() : 0)) * 37;
        MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = this.more_info_sheet_header_icon;
        int hashCode57 = (hashCode56 + (moreInfoSheetHeaderIcon != null ? moreInfoSheetHeaderIcon.hashCode() : 0)) * 37;
        UiStatusTreatment uiStatusTreatment = this.more_info_sheet_header_icon_treatment;
        int hashCode58 = (hashCode57 + (uiStatusTreatment != null ? uiStatusTreatment.hashCode() : 0)) * 37;
        PaymentHistoryReactions paymentHistoryReactions = this.reactions;
        int hashCode59 = (hashCode58 + (paymentHistoryReactions != null ? paymentHistoryReactions.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode60 = (hashCode59 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str35 = this.blockchain_transaction_id;
        int hashCode61 = (hashCode60 + (str35 != null ? str35.hashCode() : 0)) * 37;
        Boolean bool5 = this.is_bitcoin_transaction;
        int hashCode62 = (hashCode61 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        SupportOptions supportOptions = this.support_options;
        int hashCode63 = (hashCode62 + (supportOptions != null ? supportOptions.hashCode() : 0)) * 37;
        OverlayIcon overlayIcon = this.avatar_overlay_icon;
        int hashCode64 = (hashCode63 + (overlayIcon != null ? overlayIcon.hashCode() : 0)) * 37;
        String str36 = this.avatar_overlay_icon_url;
        int hashCode65 = (hashCode64 + (str36 != null ? str36.hashCode() : 0)) * 37;
        String str37 = this.dark_theme_avatar_overlay_icon_url;
        int hashCode66 = (hashCode65 + (str37 != null ? str37.hashCode() : 0)) * 37;
        Color color = this.overlay_icon_background_color;
        int hashCode67 = (hashCode66 + (color != null ? color.hashCode() : 0)) * 37;
        InfoModule infoModule = this.info_module;
        int hashCode68 = (hashCode67 + (infoModule != null ? infoModule.hashCode() : 0)) * 37;
        IconOverlayShape iconOverlayShape = this.icon_overlay_shape;
        int hashCode69 = (hashCode68 + (iconOverlayShape != null ? iconOverlayShape.hashCode() : 0)) * 37;
        Timeline timeline = this.timeline;
        int hashCode70 = (hashCode69 + (timeline != null ? timeline.hashCode() : 0)) * 37;
        StackedAvatars stackedAvatars = this.stacked_avatars;
        int hashCode71 = (hashCode70 + (stackedAvatars != null ? stackedAvatars.hashCode() : 0)) * 37;
        Boolean bool6 = this.show_chevron;
        int hashCode72 = (hashCode71 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Color color2 = this.subtitle_color;
        int hashCode73 = (hashCode72 + (color2 != null ? color2.hashCode() : 0)) * 37;
        AssociatedPaymentsOverride associatedPaymentsOverride = this.associated_payment_options;
        int hashCode74 = (hashCode73 + (associatedPaymentsOverride != null ? associatedPaymentsOverride.hashCode() : 0)) * 37;
        String str38 = this.threaded_avatar_url;
        int hashCode75 = (hashCode74 + (str38 != null ? str38.hashCode() : 0)) * 37;
        Personalization personalization = this.personalization;
        int hashCode76 = (hashCode75 + (personalization != null ? personalization.hashCode() : 0)) * 37;
        String str39 = this.primary_label;
        int hashCode77 = (hashCode76 + (str39 != null ? str39.hashCode() : 0)) * 37;
        String str40 = this.secondary_label;
        int hashCode78 = (hashCode77 + (str40 != null ? str40.hashCode() : 0)) * 37;
        String str41 = this.tertiary_label;
        int m4 = Recorder$$ExternalSyntheticOutline2.m((hashCode78 + (str41 != null ? str41.hashCode() : 0)) * 37, 37, this.receipt_sections);
        Boolean bool7 = this.prefer_avatar_field_display_on_ios;
        int hashCode79 = (m4 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        UiAvatar uiAvatar = this.ui_avatar;
        int hashCode80 = (hashCode79 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        Boolean bool8 = this.is_tap_on_avatar_disabled;
        int hashCode81 = (hashCode80 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        String str42 = this.secondary_amount_formatted_activity_list;
        int hashCode82 = (hashCode81 + (str42 != null ? str42.hashCode() : 0)) * 37;
        AmountTreatment amountTreatment4 = this.secondary_amount_treatment_activity_list;
        int hashCode83 = (hashCode82 + (amountTreatment4 != null ? amountTreatment4.hashCode() : 0)) * 37;
        Boolean bool9 = this.is_tap_on_row_disabled;
        int hashCode84 = (hashCode83 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0)) * 37;
        String str43 = this.accessibility_text;
        int hashCode85 = (hashCode84 + (str43 != null ? str43.hashCode() : 0)) * 37;
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = this.personalization_payload;
        int hashCode86 = (hashCode85 + (personalization2 != null ? personalization2.hashCode() : 0)) * 37;
        RetroEligibilityStatus retroEligibilityStatus = this.retro_eligibility_status;
        int hashCode87 = hashCode86 + (retroEligibilityStatus != null ? retroEligibilityStatus.hashCode() : 0);
        this.hashCode = hashCode87;
        return hashCode87;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.support_title = this.support_title;
        builder.support_short_title = this.support_short_title;
        builder.support_subtitle = this.support_subtitle;
        builder.support_accessibility_label = this.support_accessibility_label;
        builder.threaded_title = this.threaded_title;
        builder.threaded_subtitle = this.threaded_subtitle;
        builder.threaded_display_date = this.threaded_display_date;
        builder.relative_date = this.relative_date;
        builder.threaded_button_override = this.threaded_button_override;
        builder.preview_title = this.preview_title;
        builder.short_description = this.short_description;
        builder.long_description = this.long_description;
        builder.support_description = this.support_description;
        builder.square_message = this.square_message;
        builder.is_action_required = this.is_action_required;
        builder.is_outstanding_request = this.is_outstanding_request;
        builder.notes = this.notes;
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.url_to_open = this.url_to_open;
        builder.avatar_url_to_open = this.avatar_url_to_open;
        builder.additional_buttons = this.additional_buttons;
        builder.overflow_buttons = this.overflow_buttons;
        builder.inline_button = this.inline_button;
        builder.inline_button_treatment = this.inline_button_treatment;
        builder.inline_button_prominence = this.inline_button_prominence;
        builder.response_title = this.response_title;
        builder.is_email_receipt_required = this.is_email_receipt_required;
        builder.scenario_plan = this.scenario_plan;
        builder.scenario_plan_map = this.scenario_plan_map;
        builder.rate_plan = this.rate_plan;
        builder.sort_priority = this.sort_priority;
        builder.transaction_id = this.transaction_id;
        builder.status_text = this.status_text;
        builder.detail_view_status_title = this.detail_view_status_title;
        builder.detail_view_status_subtitle = this.detail_view_status_subtitle;
        builder.footer_text = this.footer_text;
        builder.headline = this.headline;
        builder.header_text = this.header_text;
        builder.display_instrument = this.display_instrument;
        builder.activity_section = this.activity_section;
        builder.callout_detail_item = this.callout_detail_item;
        builder.detail_rows = this.detail_rows;
        builder.detail_row_phrases = this.detail_row_phrases;
        builder.status_treatment = this.status_treatment;
        builder.confirm_cancellation_text = this.confirm_cancellation_text;
        builder.title_icon = this.title_icon;
        builder.subtitle_icon = this.subtitle_icon;
        builder.threaded_subtitle_icon = this.threaded_subtitle_icon;
        builder.amount_treatment = this.amount_treatment;
        builder.amount_treatment_activity_list = this.amount_treatment_activity_list;
        builder.amount_formatted_activity_list = this.amount_formatted_activity_list;
        builder.amount_formatted = this.amount_formatted;
        builder.amount_alternate_formatted = this.amount_alternate_formatted;
        builder.amount_alternate_treatment = this.amount_alternate_treatment;
        builder.details_view_content = this.details_view_content;
        builder.header_subtext = this.header_subtext;
        builder.header_subtext_as_markdown = this.header_subtext_as_markdown;
        builder.header_subtext_attribute_ranges = this.header_subtext_attribute_ranges;
        builder.more_info_sheet_status_text = this.more_info_sheet_status_text;
        builder.more_info_sheet_status_subtext = this.more_info_sheet_status_subtext;
        builder.more_info_sheet_header_icon = this.more_info_sheet_header_icon;
        builder.more_info_sheet_header_icon_treatment = this.more_info_sheet_header_icon_treatment;
        builder.reactions = this.reactions;
        builder.avatar = this.avatar;
        builder.blockchain_transaction_id = this.blockchain_transaction_id;
        builder.is_bitcoin_transaction = this.is_bitcoin_transaction;
        builder.support_options = this.support_options;
        builder.avatar_overlay_icon = this.avatar_overlay_icon;
        builder.avatar_overlay_icon_url = this.avatar_overlay_icon_url;
        builder.dark_theme_avatar_overlay_icon_url = this.dark_theme_avatar_overlay_icon_url;
        builder.overlay_icon_background_color = this.overlay_icon_background_color;
        builder.info_module = this.info_module;
        builder.icon_overlay_shape = this.icon_overlay_shape;
        builder.timeline = this.timeline;
        builder.stacked_avatars = this.stacked_avatars;
        builder.show_chevron = this.show_chevron;
        builder.subtitle_color = this.subtitle_color;
        builder.associated_payment_options = this.associated_payment_options;
        builder.threaded_avatar_url = this.threaded_avatar_url;
        builder.personalization = this.personalization;
        builder.primary_label = this.primary_label;
        builder.secondary_label = this.secondary_label;
        builder.tertiary_label = this.tertiary_label;
        builder.receipt_sections = this.receipt_sections;
        builder.prefer_avatar_field_display_on_ios = this.prefer_avatar_field_display_on_ios;
        builder.ui_avatar = this.ui_avatar;
        builder.is_tap_on_avatar_disabled = this.is_tap_on_avatar_disabled;
        builder.secondary_amount_formatted_activity_list = this.secondary_amount_formatted_activity_list;
        builder.secondary_amount_treatment_activity_list = this.secondary_amount_treatment_activity_list;
        builder.is_tap_on_row_disabled = this.is_tap_on_row_disabled;
        builder.accessibility_text = this.accessibility_text;
        builder.personalization_payload = this.personalization_payload;
        builder.retro_eligibility_status = this.retro_eligibility_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        if (this.support_title != null) {
            arrayList.add("support_title=██");
        }
        if (this.support_short_title != null) {
            arrayList.add("support_short_title=██");
        }
        if (this.support_subtitle != null) {
            arrayList.add("support_subtitle=██");
        }
        if (this.support_accessibility_label != null) {
            arrayList.add("support_accessibility_label=██");
        }
        if (this.threaded_title != null) {
            arrayList.add("threaded_title=██");
        }
        if (this.threaded_subtitle != null) {
            arrayList.add("threaded_subtitle=██");
        }
        String str = this.threaded_display_date;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "threaded_display_date=", arrayList);
        }
        String str2 = this.relative_date;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "relative_date=", arrayList);
        }
        ThreadedButtonOverride threadedButtonOverride = this.threaded_button_override;
        if (threadedButtonOverride != null) {
            arrayList.add("threaded_button_override=" + threadedButtonOverride);
        }
        if (this.preview_title != null) {
            arrayList.add("preview_title=██");
        }
        if (this.short_description != null) {
            arrayList.add("short_description=██");
        }
        if (this.long_description != null) {
            arrayList.add("long_description=██");
        }
        if (this.support_description != null) {
            arrayList.add("support_description=██");
        }
        if (this.square_message != null) {
            arrayList.add("square_message=██");
        }
        Boolean bool = this.is_action_required;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_action_required=", bool, arrayList);
        }
        Boolean bool2 = this.is_outstanding_request;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_outstanding_request=", bool2, arrayList);
        }
        if (this.notes != null) {
            arrayList.add("notes=██");
        }
        PaymentHistoryButton paymentHistoryButton = this.primary_button;
        if (paymentHistoryButton != null) {
            arrayList.add("primary_button=" + paymentHistoryButton);
        }
        PaymentHistoryButton paymentHistoryButton2 = this.secondary_button;
        if (paymentHistoryButton2 != null) {
            arrayList.add("secondary_button=" + paymentHistoryButton2);
        }
        if (this.url_to_open != null) {
            arrayList.add("url_to_open=██");
        }
        if (this.avatar_url_to_open != null) {
            arrayList.add("avatar_url_to_open=██");
        }
        if (!this.additional_buttons.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_buttons=", arrayList, this.additional_buttons);
        }
        if (!this.overflow_buttons.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overflow_buttons=", arrayList, this.overflow_buttons);
        }
        PaymentHistoryButton paymentHistoryButton3 = this.inline_button;
        if (paymentHistoryButton3 != null) {
            arrayList.add("inline_button=" + paymentHistoryButton3);
        }
        InlineButtonTreatment inlineButtonTreatment = this.inline_button_treatment;
        if (inlineButtonTreatment != null) {
            arrayList.add("inline_button_treatment=" + inlineButtonTreatment);
        }
        InlineButtonProminence inlineButtonProminence = this.inline_button_prominence;
        if (inlineButtonProminence != null) {
            arrayList.add("inline_button_prominence=" + inlineButtonProminence);
        }
        if (this.response_title != null) {
            arrayList.add("response_title=██");
        }
        Boolean bool3 = this.is_email_receipt_required;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_email_receipt_required=", bool3, arrayList);
        }
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        if (scenarioPlanMap != null) {
            arrayList.add("scenario_plan_map=" + scenarioPlanMap);
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        Long l = this.sort_priority;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sort_priority=", l, arrayList);
        }
        String str3 = this.transaction_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "transaction_id=", arrayList);
        }
        String str4 = this.status_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "status_text=", arrayList);
        }
        String str5 = this.detail_view_status_title;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "detail_view_status_title=", arrayList);
        }
        if (this.detail_view_status_subtitle != null) {
            arrayList.add("detail_view_status_subtitle=██");
        }
        String str6 = this.footer_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "footer_text=", arrayList);
        }
        String str7 = this.headline;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "headline=", arrayList);
        }
        if (this.header_text != null) {
            arrayList.add("header_text=██");
        }
        if (this.display_instrument != null) {
            arrayList.add("display_instrument=██");
        }
        ActivitySection activitySection = this.activity_section;
        if (activitySection != null) {
            arrayList.add("activity_section=" + activitySection);
        }
        CalloutDetailItem calloutDetailItem = this.callout_detail_item;
        if (calloutDetailItem != null) {
            arrayList.add("callout_detail_item=" + calloutDetailItem);
        }
        if (!this.detail_rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, this.detail_rows);
        }
        if (!this.detail_row_phrases.isEmpty()) {
            arrayList.add("detail_row_phrases=██");
        }
        StatusTreatment statusTreatment = this.status_treatment;
        if (statusTreatment != null) {
            arrayList.add("status_treatment=" + statusTreatment);
        }
        String str8 = this.confirm_cancellation_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "confirm_cancellation_text=", arrayList);
        }
        Icon icon = this.title_icon;
        if (icon != null) {
            arrayList.add("title_icon=" + icon);
        }
        Icon icon2 = this.subtitle_icon;
        if (icon2 != null) {
            arrayList.add("subtitle_icon=" + icon2);
        }
        Icon icon3 = this.threaded_subtitle_icon;
        if (icon3 != null) {
            arrayList.add("threaded_subtitle_icon=" + icon3);
        }
        AmountTreatment amountTreatment = this.amount_treatment;
        if (amountTreatment != null) {
            arrayList.add("amount_treatment=" + amountTreatment);
        }
        AmountTreatment amountTreatment2 = this.amount_treatment_activity_list;
        if (amountTreatment2 != null) {
            arrayList.add("amount_treatment_activity_list=" + amountTreatment2);
        }
        String str9 = this.amount_formatted_activity_list;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "amount_formatted_activity_list=", arrayList);
        }
        String str10 = this.amount_formatted;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "amount_formatted=", arrayList);
        }
        String str11 = this.amount_alternate_formatted;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "amount_alternate_formatted=", arrayList);
        }
        AmountTreatment amountTreatment3 = this.amount_alternate_treatment;
        if (amountTreatment3 != null) {
            arrayList.add("amount_alternate_treatment=" + amountTreatment3);
        }
        DetailsViewContent detailsViewContent = this.details_view_content;
        if (detailsViewContent != null) {
            arrayList.add("details_view_content=" + detailsViewContent);
        }
        if (this.header_subtext != null) {
            arrayList.add("header_subtext=██");
        }
        Boolean bool4 = this.header_subtext_as_markdown;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("header_subtext_as_markdown=", bool4, arrayList);
        }
        if (!this.header_subtext_attribute_ranges.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("header_subtext_attribute_ranges=", arrayList, this.header_subtext_attribute_ranges);
        }
        if (this.more_info_sheet_status_text != null) {
            arrayList.add("more_info_sheet_status_text=██");
        }
        if (this.more_info_sheet_status_subtext != null) {
            arrayList.add("more_info_sheet_status_subtext=██");
        }
        MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = this.more_info_sheet_header_icon;
        if (moreInfoSheetHeaderIcon != null) {
            arrayList.add("more_info_sheet_header_icon=" + moreInfoSheetHeaderIcon);
        }
        UiStatusTreatment uiStatusTreatment = this.more_info_sheet_header_icon_treatment;
        if (uiStatusTreatment != null) {
            arrayList.add("more_info_sheet_header_icon_treatment=" + uiStatusTreatment);
        }
        PaymentHistoryReactions paymentHistoryReactions = this.reactions;
        if (paymentHistoryReactions != null) {
            arrayList.add("reactions=" + paymentHistoryReactions);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        String str12 = this.blockchain_transaction_id;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "blockchain_transaction_id=", arrayList);
        }
        Boolean bool5 = this.is_bitcoin_transaction;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_bitcoin_transaction=", bool5, arrayList);
        }
        SupportOptions supportOptions = this.support_options;
        if (supportOptions != null) {
            arrayList.add("support_options=" + supportOptions);
        }
        OverlayIcon overlayIcon = this.avatar_overlay_icon;
        if (overlayIcon != null) {
            arrayList.add("avatar_overlay_icon=" + overlayIcon);
        }
        if (this.avatar_overlay_icon_url != null) {
            arrayList.add("avatar_overlay_icon_url=██");
        }
        if (this.dark_theme_avatar_overlay_icon_url != null) {
            arrayList.add("dark_theme_avatar_overlay_icon_url=██");
        }
        Color color = this.overlay_icon_background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("overlay_icon_background_color=", color, arrayList);
        }
        InfoModule infoModule = this.info_module;
        if (infoModule != null) {
            arrayList.add("info_module=" + infoModule);
        }
        IconOverlayShape iconOverlayShape = this.icon_overlay_shape;
        if (iconOverlayShape != null) {
            arrayList.add("icon_overlay_shape=" + iconOverlayShape);
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        StackedAvatars stackedAvatars = this.stacked_avatars;
        if (stackedAvatars != null) {
            arrayList.add("stacked_avatars=" + stackedAvatars);
        }
        Boolean bool6 = this.show_chevron;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_chevron=", bool6, arrayList);
        }
        Color color2 = this.subtitle_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("subtitle_color=", color2, arrayList);
        }
        AssociatedPaymentsOverride associatedPaymentsOverride = this.associated_payment_options;
        if (associatedPaymentsOverride != null) {
            arrayList.add("associated_payment_options=" + associatedPaymentsOverride);
        }
        if (this.threaded_avatar_url != null) {
            arrayList.add("threaded_avatar_url=██");
        }
        Personalization personalization = this.personalization;
        if (personalization != null) {
            arrayList.add("personalization=" + personalization);
        }
        String str13 = this.primary_label;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "primary_label=", arrayList);
        }
        String str14 = this.secondary_label;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "secondary_label=", arrayList);
        }
        String str15 = this.tertiary_label;
        if (str15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str15, "tertiary_label=", arrayList);
        }
        if (!this.receipt_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("receipt_sections=", arrayList, this.receipt_sections);
        }
        Boolean bool7 = this.prefer_avatar_field_display_on_ios;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("prefer_avatar_field_display_on_ios=", bool7, arrayList);
        }
        UiAvatar uiAvatar = this.ui_avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("ui_avatar=", uiAvatar, arrayList);
        }
        Boolean bool8 = this.is_tap_on_avatar_disabled;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_tap_on_avatar_disabled=", bool8, arrayList);
        }
        String str16 = this.secondary_amount_formatted_activity_list;
        if (str16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str16, "secondary_amount_formatted_activity_list=", arrayList);
        }
        AmountTreatment amountTreatment4 = this.secondary_amount_treatment_activity_list;
        if (amountTreatment4 != null) {
            arrayList.add("secondary_amount_treatment_activity_list=" + amountTreatment4);
        }
        Boolean bool9 = this.is_tap_on_row_disabled;
        if (bool9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_tap_on_row_disabled=", bool9, arrayList);
        }
        String str17 = this.accessibility_text;
        if (str17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str17, "accessibility_text=", arrayList);
        }
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = this.personalization_payload;
        if (personalization2 != null) {
            arrayList.add("personalization_payload=" + personalization2);
        }
        RetroEligibilityStatus retroEligibilityStatus = this.retro_eligibility_status;
        if (retroEligibilityStatus != null) {
            arrayList.add("retro_eligibility_status=" + retroEligibilityStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentHistoryData{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OUTSTANDING", "COMPLETE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivitySection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivitySection[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final ActivitySection OUTSTANDING = new ActivitySection("OUTSTANDING", 0, 1);
        public static final ActivitySection COMPLETE = new ActivitySection("COMPLETE", 1, 2);

        private static final /* synthetic */ ActivitySection[] $values() {
            return new ActivitySection[]{OUTSTANDING, COMPLETE};
        }

        static {
            ActivitySection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivitySection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$ActivitySection$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.ActivitySection fromValue(int value) {
                    return PaymentHistoryData.ActivitySection.INSTANCE.fromValue(value);
                }
            };
        }

        private ActivitySection(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ActivitySection fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ActivitySection valueOf(String str) {
            return (ActivitySection) Enum.valueOf(ActivitySection.class, str);
        }

        public static ActivitySection[] values() {
            return (ActivitySection[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ActivitySection;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActivitySection fromValue(int value) {
                if (value == 1) {
                    return ActivitySection.OUTSTANDING;
                }
                if (value != 2) {
                    return null;
                }
                return ActivitySection.COMPLETE;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STANDARD", "FADED", "STRIKETHROUGH", "SUCCEEDED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountTreatment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AmountTreatment[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final AmountTreatment STANDARD = new AmountTreatment("STANDARD", 0, 2);
        public static final AmountTreatment FADED = new AmountTreatment("FADED", 1, 6);
        public static final AmountTreatment STRIKETHROUGH = new AmountTreatment("STRIKETHROUGH", 2, 7);
        public static final AmountTreatment SUCCEEDED = new AmountTreatment("SUCCEEDED", 3, 8);

        private static final /* synthetic */ AmountTreatment[] $values() {
            return new AmountTreatment[]{STANDARD, FADED, STRIKETHROUGH, SUCCEEDED};
        }

        static {
            AmountTreatment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountTreatment.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$AmountTreatment$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.AmountTreatment fromValue(int value) {
                    return PaymentHistoryData.AmountTreatment.INSTANCE.fromValue(value);
                }
            };
        }

        private AmountTreatment(String str, int i, int i2) {
            this.value = i2;
        }

        public static final AmountTreatment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AmountTreatment valueOf(String str) {
            return (AmountTreatment) Enum.valueOf(AmountTreatment.class, str);
        }

        public static AmountTreatment[] values() {
            return (AmountTreatment[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AmountTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AmountTreatment fromValue(int value) {
                if (value == 2) {
                    return AmountTreatment.STANDARD;
                }
                if (value == 6) {
                    return AmountTreatment.FADED;
                }
                if (value == 7) {
                    return AmountTreatment.STRIKETHROUGH;
                }
                if (value != 8) {
                    return null;
                }
                return AmountTreatment.SUCCEEDED;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride$Builder;", "subtitle", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssociatedPaymentsOverride extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AssociatedPaymentsOverride> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String subtitle;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "<init>", "()V", "subtitle", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String subtitle;

            @Override // com.squareup.wire.Message.Builder
            public AssociatedPaymentsOverride build() {
                return new AssociatedPaymentsOverride(this.subtitle, buildUnknownFields());
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AssociatedPaymentsOverride.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$AssociatedPaymentsOverride$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.AssociatedPaymentsOverride decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.AssociatedPaymentsOverride((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.AssociatedPaymentsOverride value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.subtitle);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.AssociatedPaymentsOverride value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.subtitle) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.AssociatedPaymentsOverride redact(PaymentHistoryData.AssociatedPaymentsOverride value) {
                    value.getClass();
                    return PaymentHistoryData.AssociatedPaymentsOverride.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.AssociatedPaymentsOverride value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.subtitle);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AssociatedPaymentsOverride(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AssociatedPaymentsOverride copy$default(AssociatedPaymentsOverride associatedPaymentsOverride, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = associatedPaymentsOverride.subtitle;
            }
            if ((i & 2) != 0) {
                byteString = associatedPaymentsOverride.unknownFields();
            }
            return associatedPaymentsOverride.copy(str, byteString);
        }

        public final AssociatedPaymentsOverride copy(String subtitle, ByteString unknownFields) {
            unknownFields.getClass();
            return new AssociatedPaymentsOverride(subtitle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AssociatedPaymentsOverride)) {
                return false;
            }
            AssociatedPaymentsOverride associatedPaymentsOverride = (AssociatedPaymentsOverride) other;
            return Intrinsics.areEqual(unknownFields(), associatedPaymentsOverride.unknownFields()) && Intrinsics.areEqual(this.subtitle, associatedPaymentsOverride.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.subtitle;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.subtitle;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subtitle=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AssociatedPaymentsOverride{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$AssociatedPaymentsOverride;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AssociatedPaymentsOverride build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AssociatedPaymentsOverride() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssociatedPaymentsOverride(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.subtitle = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CalloutDetailItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CalloutDetailItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String label;
            public String value;

            @Override // com.squareup.wire.Message.Builder
            public CalloutDetailItem build() {
                return new CalloutDetailItem(this.label, this.value, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder value(String value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CalloutDetailItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$CalloutDetailItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.CalloutDetailItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.CalloutDetailItem((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.CalloutDetailItem value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.CalloutDetailItem value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.CalloutDetailItem redact(PaymentHistoryData.CalloutDetailItem value) {
                    value.getClass();
                    return PaymentHistoryData.CalloutDetailItem.copy$default(value, null, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.CalloutDetailItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CalloutDetailItem(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CalloutDetailItem copy$default(CalloutDetailItem calloutDetailItem, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = calloutDetailItem.label;
            }
            if ((i & 2) != 0) {
                str2 = calloutDetailItem.value;
            }
            if ((i & 4) != 0) {
                byteString = calloutDetailItem.unknownFields();
            }
            return calloutDetailItem.copy(str, str2, byteString);
        }

        public final CalloutDetailItem copy(String label, String value, ByteString unknownFields) {
            unknownFields.getClass();
            return new CalloutDetailItem(label, value, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CalloutDetailItem)) {
                return false;
            }
            CalloutDetailItem calloutDetailItem = (CalloutDetailItem) other;
            return Intrinsics.areEqual(unknownFields(), calloutDetailItem.unknownFields()) && Intrinsics.areEqual(this.label, calloutDetailItem.label) && Intrinsics.areEqual(this.value, calloutDetailItem.value);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.value = this.value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            if (this.value != null) {
                arrayList.add("value=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CalloutDetailItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$CalloutDetailItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CalloutDetailItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CalloutDetailItem() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CalloutDetailItem(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent$Builder;", "rows", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DetailsViewContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailsViewContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 0, tag = 1)
        public final List<String> rows;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "<init>", "()V", "rows", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<String> rows = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public DetailsViewContent build() {
                return new DetailsViewContent(this.rows, buildUnknownFields());
            }

            public final Builder rows(List<String> rows) {
                rows.getClass();
                TransactorKt.checkElementsNotNull(rows);
                this.rows = rows;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailsViewContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$DetailsViewContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.DetailsViewContent decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.DetailsViewContent(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ProtoAdapter.STRING.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.DetailsViewContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.rows);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.DetailsViewContent value) {
                    value.getClass();
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.rows) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.DetailsViewContent redact(PaymentHistoryData.DetailsViewContent value) {
                    value.getClass();
                    return value.copy(EmptyList.INSTANCE, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.DetailsViewContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.rows);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailsViewContent(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.rows = TransactorKt.immutableCopyOf("rows", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DetailsViewContent copy$default(DetailsViewContent detailsViewContent, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = detailsViewContent.rows;
            }
            if ((i & 2) != 0) {
                byteString = detailsViewContent.unknownFields();
            }
            return detailsViewContent.copy(list, byteString);
        }

        public final DetailsViewContent copy(List<String> rows, ByteString unknownFields) {
            rows.getClass();
            unknownFields.getClass();
            return new DetailsViewContent(rows, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DetailsViewContent)) {
                return false;
            }
            DetailsViewContent detailsViewContent = (DetailsViewContent) other;
            return Intrinsics.areEqual(unknownFields(), detailsViewContent.unknownFields()) && Intrinsics.areEqual(this.rows, detailsViewContent.rows);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.rows.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.rows = this.rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.rows.isEmpty()) {
                arrayList.add("rows=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsViewContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$DetailsViewContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DetailsViewContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DetailsViewContent(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public DetailsViewContent() {
            this(null, null, 3, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0086\u0081\u0002\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001&B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006'"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUSINESS", "NOTE", "CARD", "ONLINE", "NO_SYMBOL", "ALERT", "RETURNED", "RECURRING", "DIRECT_DEPOSIT", "DIRECT_DEBIT", "SHIELD", "INVESTING", "CLOCK", "VERIFIED", "DOUBLE_CHEVRON", "ALERT_PROMINENT", "QR_CODE", "SHIELD_CHECKMARK", "IN_PROGRESS", "PAY_WITH_CASH", "LOGOMARK", "BORROW", "TRANSFER", "GROUP", "NOTICE", "NOTICE_PROMINENT", "BLOCKED_PROMINENT", "PAYMENT_PLAN", "REINVESTMENT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Icon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Icon BUSINESS = new Icon("BUSINESS", 0, 1);
        public static final Icon NOTE = new Icon("NOTE", 1, 2);
        public static final Icon CARD = new Icon("CARD", 2, 3);
        public static final Icon ONLINE = new Icon("ONLINE", 3, 4);
        public static final Icon NO_SYMBOL = new Icon("NO_SYMBOL", 4, 5);
        public static final Icon ALERT = new Icon("ALERT", 5, 6);
        public static final Icon RETURNED = new Icon("RETURNED", 6, 7);
        public static final Icon RECURRING = new Icon("RECURRING", 7, 8);
        public static final Icon DIRECT_DEPOSIT = new Icon("DIRECT_DEPOSIT", 8, 9);
        public static final Icon DIRECT_DEBIT = new Icon("DIRECT_DEBIT", 9, 10);
        public static final Icon SHIELD = new Icon("SHIELD", 10, 11);
        public static final Icon INVESTING = new Icon("INVESTING", 11, 12);
        public static final Icon CLOCK = new Icon("CLOCK", 12, 13);
        public static final Icon VERIFIED = new Icon("VERIFIED", 13, 14);
        public static final Icon DOUBLE_CHEVRON = new Icon("DOUBLE_CHEVRON", 14, 15);
        public static final Icon ALERT_PROMINENT = new Icon("ALERT_PROMINENT", 15, 16);
        public static final Icon QR_CODE = new Icon("QR_CODE", 16, 17);
        public static final Icon SHIELD_CHECKMARK = new Icon("SHIELD_CHECKMARK", 17, 18);
        public static final Icon IN_PROGRESS = new Icon("IN_PROGRESS", 18, 19);
        public static final Icon PAY_WITH_CASH = new Icon("PAY_WITH_CASH", 19, 20);
        public static final Icon LOGOMARK = new Icon("LOGOMARK", 20, 21);
        public static final Icon BORROW = new Icon("BORROW", 21, 22);
        public static final Icon TRANSFER = new Icon("TRANSFER", 22, 23);
        public static final Icon GROUP = new Icon("GROUP", 23, 24);
        public static final Icon NOTICE = new Icon("NOTICE", 24, 25);
        public static final Icon NOTICE_PROMINENT = new Icon("NOTICE_PROMINENT", 25, 26);
        public static final Icon BLOCKED_PROMINENT = new Icon("BLOCKED_PROMINENT", 26, 27);
        public static final Icon PAYMENT_PLAN = new Icon("PAYMENT_PLAN", 27, 28);
        public static final Icon REINVESTMENT = new Icon("REINVESTMENT", 28, 29);

        private static final /* synthetic */ Icon[] $values() {
            return new Icon[]{BUSINESS, NOTE, CARD, ONLINE, NO_SYMBOL, ALERT, RETURNED, RECURRING, DIRECT_DEPOSIT, DIRECT_DEBIT, SHIELD, INVESTING, CLOCK, VERIFIED, DOUBLE_CHEVRON, ALERT_PROMINENT, QR_CODE, SHIELD_CHECKMARK, IN_PROGRESS, PAY_WITH_CASH, LOGOMARK, BORROW, TRANSFER, GROUP, NOTICE, NOTICE_PROMINENT, BLOCKED_PROMINENT, PAYMENT_PLAN, REINVESTMENT};
        }

        static {
            Icon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Icon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$Icon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.Icon fromValue(int value) {
                    return PaymentHistoryData.Icon.INSTANCE.fromValue(value);
                }
            };
        }

        private Icon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Icon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Icon fromValue(int value) {
                switch (value) {
                    case 1:
                        return Icon.BUSINESS;
                    case 2:
                        return Icon.NOTE;
                    case 3:
                        return Icon.CARD;
                    case 4:
                        return Icon.ONLINE;
                    case 5:
                        return Icon.NO_SYMBOL;
                    case 6:
                        return Icon.ALERT;
                    case 7:
                        return Icon.RETURNED;
                    case 8:
                        return Icon.RECURRING;
                    case 9:
                        return Icon.DIRECT_DEPOSIT;
                    case 10:
                        return Icon.DIRECT_DEBIT;
                    case 11:
                        return Icon.SHIELD;
                    case 12:
                        return Icon.INVESTING;
                    case 13:
                        return Icon.CLOCK;
                    case 14:
                        return Icon.VERIFIED;
                    case 15:
                        return Icon.DOUBLE_CHEVRON;
                    case 16:
                        return Icon.ALERT_PROMINENT;
                    case 17:
                        return Icon.QR_CODE;
                    case 18:
                        return Icon.SHIELD_CHECKMARK;
                    case 19:
                        return Icon.IN_PROGRESS;
                    case 20:
                        return Icon.PAY_WITH_CASH;
                    case 21:
                        return Icon.LOGOMARK;
                    case 22:
                        return Icon.BORROW;
                    case 23:
                        return Icon.TRANSFER;
                    case 24:
                        return Icon.GROUP;
                    case 25:
                        return Icon.NOTICE;
                    case 26:
                        return Icon.NOTICE_PROMINENT;
                    case 27:
                        return Icon.BLOCKED_PROMINENT;
                    case 28:
                        return Icon.PAYMENT_PLAN;
                    case 29:
                        return Icon.REINVESTMENT;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CIRCULAR_SHAPE", "CARD_SHAPE", "CIRCULAR_BADGE_SHAPE", "SQUARE_NO_CUTOUT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IconOverlayShape implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconOverlayShape[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final IconOverlayShape CIRCULAR_SHAPE = new IconOverlayShape("CIRCULAR_SHAPE", 0, 1);
        public static final IconOverlayShape CARD_SHAPE = new IconOverlayShape("CARD_SHAPE", 1, 2);
        public static final IconOverlayShape CIRCULAR_BADGE_SHAPE = new IconOverlayShape("CIRCULAR_BADGE_SHAPE", 2, 3);
        public static final IconOverlayShape SQUARE_NO_CUTOUT = new IconOverlayShape("SQUARE_NO_CUTOUT", 3, 4);

        private static final /* synthetic */ IconOverlayShape[] $values() {
            return new IconOverlayShape[]{CIRCULAR_SHAPE, CARD_SHAPE, CIRCULAR_BADGE_SHAPE, SQUARE_NO_CUTOUT};
        }

        static {
            IconOverlayShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IconOverlayShape.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$IconOverlayShape$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.IconOverlayShape fromValue(int value) {
                    return PaymentHistoryData.IconOverlayShape.INSTANCE.fromValue(value);
                }
            };
        }

        private IconOverlayShape(String str, int i, int i2) {
            this.value = i2;
        }

        public static final IconOverlayShape fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static IconOverlayShape valueOf(String str) {
            return (IconOverlayShape) Enum.valueOf(IconOverlayShape.class, str);
        }

        public static IconOverlayShape[] values() {
            return (IconOverlayShape[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final IconOverlayShape fromValue(int value) {
                if (value == 1) {
                    return IconOverlayShape.CIRCULAR_SHAPE;
                }
                if (value == 2) {
                    return IconOverlayShape.CARD_SHAPE;
                }
                if (value == 3) {
                    return IconOverlayShape.CIRCULAR_BADGE_SHAPE;
                }
                if (value != 4) {
                    return null;
                }
                return IconOverlayShape.SQUARE_NO_CUTOUT;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016JX\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule$Builder;", "title", "", "title_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "title_icon_color", "Lcom/squareup/protos/cash/ui/Color;", "description", "description_markdown", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InfoModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoModule> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 5, tag = 5)
        public final PaymentHistoryButton button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 3)
        public final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
        public final String description_markdown;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$Icon#ADAPTER", schemaIndex = 1, tag = 2)
        public final Icon title_icon;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 6)
        public final Color title_icon_color;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "<init>", "()V", "title", "", "title_icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "title_icon_color", "Lcom/squareup/protos/cash/ui/Color;", "description", "description_markdown", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public PaymentHistoryButton button;
            public String description;
            public String description_markdown;
            public String title;
            public Icon title_icon;
            public Color title_icon_color;

            @Override // com.squareup.wire.Message.Builder
            public InfoModule build() {
                return new InfoModule(this.title, this.title_icon, this.title_icon_color, this.description, this.description_markdown, this.button, buildUnknownFields());
            }

            public final Builder button(PaymentHistoryButton button) {
                this.button = button;
                return this;
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder description_markdown(String description_markdown) {
                this.description_markdown = description_markdown;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }

            public final Builder title_icon(Icon title_icon) {
                this.title_icon = title_icon;
                return this;
            }

            public final Builder title_icon_color(Color title_icon_color) {
                this.title_icon_color = title_icon_color;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InfoModule.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$InfoModule$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.InfoModule decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.InfoModule((String) obj, (PaymentHistoryData.Icon) obj2, (Color) obj3, (String) obj4, (String) obj5, (PaymentHistoryButton) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    obj2 = PaymentHistoryData.Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj6 = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.ADAPTER, reader, obj6);
                                break;
                            case 6:
                                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.InfoModule value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    PaymentHistoryData.Icon.ADAPTER.encodeWithTag(writer, 2, value.title_icon);
                    Color.ADAPTER.encodeWithTag(writer, 6, value.title_icon_color);
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    protoAdapter2.encodeWithTag(writer, 4, value.description_markdown);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 5, value.button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.InfoModule value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return PaymentHistoryButton.ADAPTER.encodedSizeWithTag(5, value.button) + protoAdapter2.encodedSizeWithTag(4, value.description_markdown) + protoAdapter2.encodedSizeWithTag(3, value.description) + Color.ADAPTER.encodedSizeWithTag(6, value.title_icon_color) + PaymentHistoryData.Icon.ADAPTER.encodedSizeWithTag(2, value.title_icon) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.InfoModule redact(PaymentHistoryData.InfoModule value) {
                    value.getClass();
                    Color color = value.title_icon_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    PaymentHistoryButton paymentHistoryButton = value.button;
                    return PaymentHistoryData.InfoModule.copy$default(value, null, null, color2, null, null, paymentHistoryButton != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton) : null, ByteString.EMPTY, 27, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.InfoModule value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 5, value.button);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.description_markdown);
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    Color.ADAPTER.encodeWithTag(writer, 6, value.title_icon_color);
                    PaymentHistoryData.Icon.ADAPTER.encodeWithTag(writer, 2, value.title_icon);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InfoModule(String str, Icon icon, Color color, String str2, String str3, PaymentHistoryButton paymentHistoryButton, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : paymentHistoryButton, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InfoModule copy$default(InfoModule infoModule, String str, Icon icon, Color color, String str2, String str3, PaymentHistoryButton paymentHistoryButton, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoModule.title;
            }
            if ((i & 2) != 0) {
                icon = infoModule.title_icon;
            }
            if ((i & 4) != 0) {
                color = infoModule.title_icon_color;
            }
            if ((i & 8) != 0) {
                str2 = infoModule.description;
            }
            if ((i & 16) != 0) {
                str3 = infoModule.description_markdown;
            }
            if ((i & 32) != 0) {
                paymentHistoryButton = infoModule.button;
            }
            if ((i & 64) != 0) {
                byteString = infoModule.unknownFields();
            }
            PaymentHistoryButton paymentHistoryButton2 = paymentHistoryButton;
            ByteString byteString2 = byteString;
            String str4 = str3;
            Color color2 = color;
            return infoModule.copy(str, icon, color2, str2, str4, paymentHistoryButton2, byteString2);
        }

        public final InfoModule copy(String title, Icon title_icon, Color title_icon_color, String description, String description_markdown, PaymentHistoryButton button, ByteString unknownFields) {
            unknownFields.getClass();
            return new InfoModule(title, title_icon, title_icon_color, description, description_markdown, button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InfoModule)) {
                return false;
            }
            InfoModule infoModule = (InfoModule) other;
            return Intrinsics.areEqual(unknownFields(), infoModule.unknownFields()) && Intrinsics.areEqual(this.title, infoModule.title) && this.title_icon == infoModule.title_icon && Intrinsics.areEqual(this.title_icon_color, infoModule.title_icon_color) && Intrinsics.areEqual(this.description, infoModule.description) && Intrinsics.areEqual(this.description_markdown, infoModule.description_markdown) && Intrinsics.areEqual(this.button, infoModule.button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Icon icon = this.title_icon;
            int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
            Color color = this.title_icon_color;
            int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.description_markdown;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            PaymentHistoryButton paymentHistoryButton = this.button;
            int hashCode7 = hashCode6 + (paymentHistoryButton != null ? paymentHistoryButton.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.title_icon = this.title_icon;
            builder.title_icon_color = this.title_icon_color;
            builder.description = this.description;
            builder.description_markdown = this.description_markdown;
            builder.button = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            Icon icon = this.title_icon;
            if (icon != null) {
                arrayList.add("title_icon=" + icon);
            }
            Color color = this.title_icon_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("title_icon_color=", color, arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            String str3 = this.description_markdown;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "description_markdown=", arrayList);
            }
            PaymentHistoryButton paymentHistoryButton = this.button;
            if (paymentHistoryButton != null) {
                arrayList.add("button=" + paymentHistoryButton);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoModule{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InfoModule;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InfoModule build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InfoModule() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoModule(String str, Icon icon, Color color, String str2, String str3, PaymentHistoryButton paymentHistoryButton, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.title_icon = icon;
            this.title_icon_color = color;
            this.description = str2;
            this.description_markdown = str3;
            this.button = paymentHistoryButton;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_STANDARD", "PROMINENT", "SUBTLE", "DESTRUCTIVE_STANDARD", "DESTRUCTIVE_PROMINENT", "DESTRUCTIVE_SUBTLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InlineButtonProminence implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InlineButtonProminence[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final InlineButtonProminence DEFAULT_STANDARD = new InlineButtonProminence("DEFAULT_STANDARD", 0, 1);
        public static final InlineButtonProminence PROMINENT = new InlineButtonProminence("PROMINENT", 1, 2);
        public static final InlineButtonProminence SUBTLE = new InlineButtonProminence("SUBTLE", 2, 3);
        public static final InlineButtonProminence DESTRUCTIVE_STANDARD = new InlineButtonProminence("DESTRUCTIVE_STANDARD", 3, 4);
        public static final InlineButtonProminence DESTRUCTIVE_PROMINENT = new InlineButtonProminence("DESTRUCTIVE_PROMINENT", 4, 5);
        public static final InlineButtonProminence DESTRUCTIVE_SUBTLE = new InlineButtonProminence("DESTRUCTIVE_SUBTLE", 5, 6);

        private static final /* synthetic */ InlineButtonProminence[] $values() {
            return new InlineButtonProminence[]{DEFAULT_STANDARD, PROMINENT, SUBTLE, DESTRUCTIVE_STANDARD, DESTRUCTIVE_PROMINENT, DESTRUCTIVE_SUBTLE};
        }

        static {
            InlineButtonProminence[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InlineButtonProminence.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$InlineButtonProminence$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.InlineButtonProminence fromValue(int value) {
                    return PaymentHistoryData.InlineButtonProminence.INSTANCE.fromValue(value);
                }
            };
        }

        private InlineButtonProminence(String str, int i, int i2) {
            this.value = i2;
        }

        public static final InlineButtonProminence fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static InlineButtonProminence valueOf(String str) {
            return (InlineButtonProminence) Enum.valueOf(InlineButtonProminence.class, str);
        }

        public static InlineButtonProminence[] values() {
            return (InlineButtonProminence[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonProminence;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InlineButtonProminence fromValue(int value) {
                switch (value) {
                    case 1:
                        return InlineButtonProminence.DEFAULT_STANDARD;
                    case 2:
                        return InlineButtonProminence.PROMINENT;
                    case 3:
                        return InlineButtonProminence.SUBTLE;
                    case 4:
                        return InlineButtonProminence.DESTRUCTIVE_STANDARD;
                    case 5:
                        return InlineButtonProminence.DESTRUCTIVE_PROMINENT;
                    case 6:
                        return InlineButtonProminence.DESTRUCTIVE_SUBTLE;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRIMARY", "ALTERNATE", "OPTIONAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InlineButtonTreatment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InlineButtonTreatment[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final InlineButtonTreatment PRIMARY = new InlineButtonTreatment("PRIMARY", 0, 1);
        public static final InlineButtonTreatment ALTERNATE = new InlineButtonTreatment("ALTERNATE", 1, 2);
        public static final InlineButtonTreatment OPTIONAL = new InlineButtonTreatment("OPTIONAL", 2, 3);

        private static final /* synthetic */ InlineButtonTreatment[] $values() {
            return new InlineButtonTreatment[]{PRIMARY, ALTERNATE, OPTIONAL};
        }

        static {
            InlineButtonTreatment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InlineButtonTreatment.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$InlineButtonTreatment$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.InlineButtonTreatment fromValue(int value) {
                    return PaymentHistoryData.InlineButtonTreatment.INSTANCE.fromValue(value);
                }
            };
        }

        private InlineButtonTreatment(String str, int i, int i2) {
            this.value = i2;
        }

        public static final InlineButtonTreatment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static InlineButtonTreatment valueOf(String str) {
            return (InlineButtonTreatment) Enum.valueOf(InlineButtonTreatment.class, str);
        }

        public static InlineButtonTreatment[] values() {
            return (InlineButtonTreatment[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InlineButtonTreatment fromValue(int value) {
                if (value == 1) {
                    return InlineButtonTreatment.PRIMARY;
                }
                if (value == 2) {
                    return InlineButtonTreatment.ALTERNATE;
                }
                if (value != 3) {
                    return null;
                }
                return InlineButtonTreatment.OPTIONAL;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton$Builder;", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "button_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InlinePaymentHistoryButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InlinePaymentHistoryButton> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 0, tag = 1)
        public final PaymentHistoryButton button;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$InlineButtonTreatment#ADAPTER", schemaIndex = 1, tag = 2)
        public final InlineButtonTreatment button_treatment;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "<init>", "()V", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "button_treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlineButtonTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public PaymentHistoryButton button;
            public InlineButtonTreatment button_treatment;

            @Override // com.squareup.wire.Message.Builder
            public InlinePaymentHistoryButton build() {
                return new InlinePaymentHistoryButton(this.button, this.button_treatment, buildUnknownFields());
            }

            public final Builder button(PaymentHistoryButton button) {
                this.button = button;
                return this;
            }

            public final Builder button_treatment(InlineButtonTreatment button_treatment) {
                this.button_treatment = button_treatment;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InlinePaymentHistoryButton.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$InlinePaymentHistoryButton$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.InlinePaymentHistoryButton decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.InlinePaymentHistoryButton((PaymentHistoryButton) obj, (PaymentHistoryData.InlineButtonTreatment) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = PaymentHistoryData.InlineButtonTreatment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.InlinePaymentHistoryButton value) {
                    writer.getClass();
                    value.getClass();
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 1, value.button);
                    PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(writer, 2, value.button_treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.InlinePaymentHistoryButton value) {
                    value.getClass();
                    return PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodedSizeWithTag(2, value.button_treatment) + PaymentHistoryButton.ADAPTER.encodedSizeWithTag(1, value.button) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.InlinePaymentHistoryButton redact(PaymentHistoryData.InlinePaymentHistoryButton value) {
                    value.getClass();
                    PaymentHistoryButton paymentHistoryButton = value.button;
                    return PaymentHistoryData.InlinePaymentHistoryButton.copy$default(value, paymentHistoryButton != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.InlinePaymentHistoryButton value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(writer, 2, value.button_treatment);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 1, value.button);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InlinePaymentHistoryButton(PaymentHistoryButton paymentHistoryButton, InlineButtonTreatment inlineButtonTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentHistoryButton, (i & 2) != 0 ? null : inlineButtonTreatment, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InlinePaymentHistoryButton copy$default(InlinePaymentHistoryButton inlinePaymentHistoryButton, PaymentHistoryButton paymentHistoryButton, InlineButtonTreatment inlineButtonTreatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentHistoryButton = inlinePaymentHistoryButton.button;
            }
            if ((i & 2) != 0) {
                inlineButtonTreatment = inlinePaymentHistoryButton.button_treatment;
            }
            if ((i & 4) != 0) {
                byteString = inlinePaymentHistoryButton.unknownFields();
            }
            return inlinePaymentHistoryButton.copy(paymentHistoryButton, inlineButtonTreatment, byteString);
        }

        public final InlinePaymentHistoryButton copy(PaymentHistoryButton button, InlineButtonTreatment button_treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new InlinePaymentHistoryButton(button, button_treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InlinePaymentHistoryButton)) {
                return false;
            }
            InlinePaymentHistoryButton inlinePaymentHistoryButton = (InlinePaymentHistoryButton) other;
            return Intrinsics.areEqual(unknownFields(), inlinePaymentHistoryButton.unknownFields()) && Intrinsics.areEqual(this.button, inlinePaymentHistoryButton.button) && this.button_treatment == inlinePaymentHistoryButton.button_treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            PaymentHistoryButton paymentHistoryButton = this.button;
            int hashCode2 = (hashCode + (paymentHistoryButton != null ? paymentHistoryButton.hashCode() : 0)) * 37;
            InlineButtonTreatment inlineButtonTreatment = this.button_treatment;
            int hashCode3 = hashCode2 + (inlineButtonTreatment != null ? inlineButtonTreatment.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.button = this.button;
            builder.button_treatment = this.button_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            PaymentHistoryButton paymentHistoryButton = this.button;
            if (paymentHistoryButton != null) {
                arrayList.add("button=" + paymentHistoryButton);
            }
            InlineButtonTreatment inlineButtonTreatment = this.button_treatment;
            if (inlineButtonTreatment != null) {
                arrayList.add("button_treatment=" + inlineButtonTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InlinePaymentHistoryButton{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InlinePaymentHistoryButton build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InlinePaymentHistoryButton() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InlinePaymentHistoryButton(PaymentHistoryButton paymentHistoryButton, InlineButtonTreatment inlineButtonTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.button = paymentHistoryButton;
            this.button_treatment = inlineButtonTreatment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKMARK", "ERROR", "INSTANT", "WAITING", "REPORTED", "SECURITY_SHIELD", "SKIPPED", "BLOCKED", "ALERT_FILLED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MoreInfoSheetHeaderIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MoreInfoSheetHeaderIcon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final MoreInfoSheetHeaderIcon CHECKMARK = new MoreInfoSheetHeaderIcon("CHECKMARK", 0, 1);
        public static final MoreInfoSheetHeaderIcon ERROR = new MoreInfoSheetHeaderIcon("ERROR", 1, 2);
        public static final MoreInfoSheetHeaderIcon INSTANT = new MoreInfoSheetHeaderIcon("INSTANT", 2, 3);
        public static final MoreInfoSheetHeaderIcon WAITING = new MoreInfoSheetHeaderIcon("WAITING", 3, 4);

        @Deprecated
        public static final MoreInfoSheetHeaderIcon REPORTED = new MoreInfoSheetHeaderIcon("REPORTED", 4, 5);
        public static final MoreInfoSheetHeaderIcon SECURITY_SHIELD = new MoreInfoSheetHeaderIcon("SECURITY_SHIELD", 5, 6);
        public static final MoreInfoSheetHeaderIcon SKIPPED = new MoreInfoSheetHeaderIcon("SKIPPED", 6, 7);
        public static final MoreInfoSheetHeaderIcon BLOCKED = new MoreInfoSheetHeaderIcon("BLOCKED", 7, 8);
        public static final MoreInfoSheetHeaderIcon ALERT_FILLED = new MoreInfoSheetHeaderIcon("ALERT_FILLED", 8, 9);

        private static final /* synthetic */ MoreInfoSheetHeaderIcon[] $values() {
            return new MoreInfoSheetHeaderIcon[]{CHECKMARK, ERROR, INSTANT, WAITING, REPORTED, SECURITY_SHIELD, SKIPPED, BLOCKED, ALERT_FILLED};
        }

        static {
            MoreInfoSheetHeaderIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MoreInfoSheetHeaderIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$MoreInfoSheetHeaderIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.MoreInfoSheetHeaderIcon fromValue(int value) {
                    return PaymentHistoryData.MoreInfoSheetHeaderIcon.INSTANCE.fromValue(value);
                }
            };
        }

        private MoreInfoSheetHeaderIcon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final MoreInfoSheetHeaderIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static MoreInfoSheetHeaderIcon valueOf(String str) {
            return (MoreInfoSheetHeaderIcon) Enum.valueOf(MoreInfoSheetHeaderIcon.class, str);
        }

        public static MoreInfoSheetHeaderIcon[] values() {
            return (MoreInfoSheetHeaderIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$MoreInfoSheetHeaderIcon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MoreInfoSheetHeaderIcon fromValue(int value) {
                switch (value) {
                    case 1:
                        return MoreInfoSheetHeaderIcon.CHECKMARK;
                    case 2:
                        return MoreInfoSheetHeaderIcon.ERROR;
                    case 3:
                        return MoreInfoSheetHeaderIcon.INSTANT;
                    case 4:
                        return MoreInfoSheetHeaderIcon.WAITING;
                    case 5:
                        return MoreInfoSheetHeaderIcon.REPORTED;
                    case 6:
                        return MoreInfoSheetHeaderIcon.SECURITY_SHIELD;
                    case 7:
                        return MoreInfoSheetHeaderIcon.SKIPPED;
                    case 8:
                        return MoreInfoSheetHeaderIcon.BLOCKED;
                    case 9:
                        return MoreInfoSheetHeaderIcon.ALERT_FILLED;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RECURRING_OVERLAY", "LOYALTY_OVERLAY", "LINKED_ACCOUNT", "LIGHTNING_BOLT", "ROUND_UP", "INVEST_WHERE_YOU_SHOP", "INSTANT_PAY_LIGHTNING_BOLT", "COUPON_OVERLAY", "OVERDRAFT_PROTECTION", "PAYMENT_PLAN_OVERLAY", "DEPOSIT", "SQUARE_LOGO", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OverlayIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OverlayIcon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final OverlayIcon RECURRING_OVERLAY = new OverlayIcon("RECURRING_OVERLAY", 0, 1);
        public static final OverlayIcon LOYALTY_OVERLAY = new OverlayIcon("LOYALTY_OVERLAY", 1, 2);
        public static final OverlayIcon LINKED_ACCOUNT = new OverlayIcon("LINKED_ACCOUNT", 2, 3);
        public static final OverlayIcon LIGHTNING_BOLT = new OverlayIcon("LIGHTNING_BOLT", 3, 4);
        public static final OverlayIcon ROUND_UP = new OverlayIcon("ROUND_UP", 4, 5);
        public static final OverlayIcon INVEST_WHERE_YOU_SHOP = new OverlayIcon("INVEST_WHERE_YOU_SHOP", 5, 6);
        public static final OverlayIcon INSTANT_PAY_LIGHTNING_BOLT = new OverlayIcon("INSTANT_PAY_LIGHTNING_BOLT", 6, 7);
        public static final OverlayIcon COUPON_OVERLAY = new OverlayIcon("COUPON_OVERLAY", 7, 8);
        public static final OverlayIcon OVERDRAFT_PROTECTION = new OverlayIcon("OVERDRAFT_PROTECTION", 8, 9);
        public static final OverlayIcon PAYMENT_PLAN_OVERLAY = new OverlayIcon("PAYMENT_PLAN_OVERLAY", 9, 10);
        public static final OverlayIcon DEPOSIT = new OverlayIcon("DEPOSIT", 10, 11);
        public static final OverlayIcon SQUARE_LOGO = new OverlayIcon("SQUARE_LOGO", 11, 12);

        private static final /* synthetic */ OverlayIcon[] $values() {
            return new OverlayIcon[]{RECURRING_OVERLAY, LOYALTY_OVERLAY, LINKED_ACCOUNT, LIGHTNING_BOLT, ROUND_UP, INVEST_WHERE_YOU_SHOP, INSTANT_PAY_LIGHTNING_BOLT, COUPON_OVERLAY, OVERDRAFT_PROTECTION, PAYMENT_PLAN_OVERLAY, DEPOSIT, SQUARE_LOGO};
        }

        static {
            OverlayIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OverlayIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$OverlayIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.OverlayIcon fromValue(int value) {
                    return PaymentHistoryData.OverlayIcon.INSTANCE.fromValue(value);
                }
            };
        }

        private OverlayIcon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final OverlayIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static OverlayIcon valueOf(String str) {
            return (OverlayIcon) Enum.valueOf(OverlayIcon.class, str);
        }

        public static OverlayIcon[] values() {
            return (OverlayIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$OverlayIcon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OverlayIcon fromValue(int value) {
                switch (value) {
                    case 1:
                        return OverlayIcon.RECURRING_OVERLAY;
                    case 2:
                        return OverlayIcon.LOYALTY_OVERLAY;
                    case 3:
                        return OverlayIcon.LINKED_ACCOUNT;
                    case 4:
                        return OverlayIcon.LIGHTNING_BOLT;
                    case 5:
                        return OverlayIcon.ROUND_UP;
                    case 6:
                        return OverlayIcon.INVEST_WHERE_YOU_SHOP;
                    case 7:
                        return OverlayIcon.INSTANT_PAY_LIGHTNING_BOLT;
                    case 8:
                        return OverlayIcon.COUPON_OVERLAY;
                    case 9:
                        return OverlayIcon.OVERDRAFT_PROTECTION;
                    case 10:
                        return OverlayIcon.PAYMENT_PLAN_OVERLAY;
                    case 11:
                        return OverlayIcon.DEPOSIT;
                    case 12:
                        return OverlayIcon.SQUARE_LOGO;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBI\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0007H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016JM\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars$Builder;", "images", "", "Lcom/squareup/protos/cash/ui/Image;", "overflow_count", "", "overflow_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "avatars", "Lcom/squareup/protos/franklin/ui/Avatar;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lcom/squareup/protos/cash/ui/Color;Ljava/util/List;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lcom/squareup/protos/cash/ui/Color;Ljava/util/List;Lokio/ByteString;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StackedAvatars extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StackedAvatars> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Avatar#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<Avatar> avatars;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Image> images;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
        public final Color overflow_accent_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Integer overflow_count;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "<init>", "()V", "images", "", "Lcom/squareup/protos/cash/ui/Image;", "overflow_count", "", "Ljava/lang/Integer;", "overflow_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "avatars", "Lcom/squareup/protos/franklin/ui/Avatar;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Avatar> avatars;
            public List<Image> images;
            public Color overflow_accent_color;
            public Integer overflow_count;

            public Builder() {
                EmptyList emptyList = EmptyList.INSTANCE;
                this.images = emptyList;
                this.avatars = emptyList;
            }

            public final Builder avatars(List<Avatar> avatars) {
                avatars.getClass();
                TransactorKt.checkElementsNotNull(avatars);
                this.avatars = avatars;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public StackedAvatars build() {
                return new StackedAvatars(this.images, this.overflow_count, this.overflow_accent_color, this.avatars, buildUnknownFields());
            }

            public final Builder images(List<Image> images) {
                images.getClass();
                TransactorKt.checkElementsNotNull(images);
                this.images = images;
                return this;
            }

            public final Builder overflow_accent_color(Color overflow_accent_color) {
                this.overflow_accent_color = overflow_accent_color;
                return this;
            }

            public final Builder overflow_count(Integer overflow_count) {
                this.overflow_count = overflow_count;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StackedAvatars.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$StackedAvatars$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.StackedAvatars decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.StackedAvatars(m, (Integer) obj, (Color) obj2, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(Image.ADAPTER.decode(reader));
                        } else if (nextTag == 2) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag == 3) {
                            obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(Avatar.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.StackedAvatars value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.images);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.overflow_count);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.overflow_accent_color);
                    Avatar.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.avatars);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.StackedAvatars value) {
                    value.getClass();
                    return Avatar.ADAPTER.asRepeated().encodedSizeWithTag(4, value.avatars) + Color.ADAPTER.encodedSizeWithTag(3, value.overflow_accent_color) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.overflow_count) + Image.ADAPTER.asRepeated().encodedSizeWithTag(1, value.images) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.StackedAvatars redact(PaymentHistoryData.StackedAvatars value) {
                    value.getClass();
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.images, Image.ADAPTER);
                    Color color = value.overflow_accent_color;
                    return PaymentHistoryData.StackedAvatars.copy$default(value, m1169redactElements, null, color != null ? (Color) Color.ADAPTER.redact(color) : null, TransactorKt.m1169redactElements(value.avatars, Avatar.ADAPTER), ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.StackedAvatars value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Avatar.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.avatars);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.overflow_accent_color);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.overflow_count);
                    Image.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.images);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public StackedAvatars(List list, Integer num, Color color, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : color, (i & 8) != 0 ? EmptyList.INSTANCE : list2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ StackedAvatars copy$default(StackedAvatars stackedAvatars, List list, Integer num, Color color, List list2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stackedAvatars.images;
            }
            if ((i & 2) != 0) {
                num = stackedAvatars.overflow_count;
            }
            if ((i & 4) != 0) {
                color = stackedAvatars.overflow_accent_color;
            }
            if ((i & 8) != 0) {
                list2 = stackedAvatars.avatars;
            }
            if ((i & 16) != 0) {
                byteString = stackedAvatars.unknownFields();
            }
            ByteString byteString2 = byteString;
            Color color2 = color;
            return stackedAvatars.copy(list, num, color2, list2, byteString2);
        }

        public final StackedAvatars copy(List<Image> images, Integer overflow_count, Color overflow_accent_color, List<Avatar> avatars, ByteString unknownFields) {
            images.getClass();
            avatars.getClass();
            unknownFields.getClass();
            return new StackedAvatars(images, overflow_count, overflow_accent_color, avatars, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StackedAvatars)) {
                return false;
            }
            StackedAvatars stackedAvatars = (StackedAvatars) other;
            return Intrinsics.areEqual(unknownFields(), stackedAvatars.unknownFields()) && Intrinsics.areEqual(this.images, stackedAvatars.images) && Intrinsics.areEqual(this.overflow_count, stackedAvatars.overflow_count) && Intrinsics.areEqual(this.overflow_accent_color, stackedAvatars.overflow_accent_color) && Intrinsics.areEqual(this.avatars, stackedAvatars.avatars);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.images);
            Integer num = this.overflow_count;
            int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Color color = this.overflow_accent_color;
            int hashCode2 = this.avatars.hashCode() + ((hashCode + (color != null ? color.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.images = this.images;
            builder.overflow_count = this.overflow_count;
            builder.overflow_accent_color = this.overflow_accent_color;
            builder.avatars = this.avatars;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.images.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("images=", arrayList, this.images);
            }
            Integer num = this.overflow_count;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("overflow_count=", num, arrayList);
            }
            Color color = this.overflow_accent_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("overflow_accent_color=", color, arrayList);
            }
            if (!this.avatars.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("avatars=", arrayList, this.avatars);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StackedAvatars{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StackedAvatars;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ StackedAvatars build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StackedAvatars(List<Image> list, Integer num, Color color, List<Avatar> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.overflow_count = num;
            this.overflow_accent_color = color;
            this.images = TransactorKt.immutableCopyOf("images", list);
            this.avatars = TransactorKt.immutableCopyOf("avatars", list2);
        }

        public StackedAvatars() {
            this(null, null, null, null, null, 31, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "SUCCESS", "FAILURE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class StatusTreatment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusTreatment[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final StatusTreatment NORMAL = new StatusTreatment("NORMAL", 0, 1);
        public static final StatusTreatment SUCCESS = new StatusTreatment("SUCCESS", 1, 2);
        public static final StatusTreatment FAILURE = new StatusTreatment("FAILURE", 2, 3);

        private static final /* synthetic */ StatusTreatment[] $values() {
            return new StatusTreatment[]{NORMAL, SUCCESS, FAILURE};
        }

        static {
            StatusTreatment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StatusTreatment.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$StatusTreatment$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.StatusTreatment fromValue(int value) {
                    return PaymentHistoryData.StatusTreatment.INSTANCE.fromValue(value);
                }
            };
        }

        private StatusTreatment(String str, int i, int i2) {
            this.value = i2;
        }

        public static final StatusTreatment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static StatusTreatment valueOf(String str) {
            return (StatusTreatment) Enum.valueOf(StatusTreatment.class, str);
        }

        public static StatusTreatment[] values() {
            return (StatusTreatment[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$StatusTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final StatusTreatment fromValue(int value) {
                if (value == 1) {
                    return StatusTreatment.NORMAL;
                }
                if (value == 2) {
                    return StatusTreatment.SUCCESS;
                }
                if (value != 3) {
                    return null;
                }
                return StatusTreatment.FAILURE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J,\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions$Builder;", "header_text", "", "buttons", "", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SupportOptions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SupportOptions> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<PaymentHistoryButton> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header_text;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "<init>", "()V", "header_text", "", "buttons", "", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<PaymentHistoryButton> buttons = EmptyList.INSTANCE;
            public String header_text;

            @Override // com.squareup.wire.Message.Builder
            public SupportOptions build() {
                return new SupportOptions(this.header_text, this.buttons, buildUnknownFields());
            }

            public final Builder buttons(List<PaymentHistoryButton> buttons) {
                buttons.getClass();
                TransactorKt.checkElementsNotNull(buttons);
                this.buttons = buttons;
                return this;
            }

            public final Builder header_text(String header_text) {
                this.header_text = header_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SupportOptions.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$SupportOptions$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.SupportOptions decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.SupportOptions((String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(PaymentHistoryButton.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.SupportOptions value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.header_text);
                    PaymentHistoryButton.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.buttons);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.SupportOptions value) {
                    value.getClass();
                    return PaymentHistoryButton.ADAPTER.asRepeated().encodedSizeWithTag(2, value.buttons) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.header_text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.SupportOptions redact(PaymentHistoryData.SupportOptions value) {
                    value.getClass();
                    return PaymentHistoryData.SupportOptions.copy$default(value, null, TransactorKt.m1169redactElements(value.buttons, PaymentHistoryButton.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.SupportOptions value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentHistoryButton.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.buttons);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.header_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportOptions(String str, List<PaymentHistoryButton> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_text = str;
            this.buttons = TransactorKt.immutableCopyOf("buttons", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SupportOptions copy$default(SupportOptions supportOptions, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = supportOptions.header_text;
            }
            if ((i & 2) != 0) {
                list = supportOptions.buttons;
            }
            if ((i & 4) != 0) {
                byteString = supportOptions.unknownFields();
            }
            return supportOptions.copy(str, list, byteString);
        }

        public final SupportOptions copy(String header_text, List<PaymentHistoryButton> buttons, ByteString unknownFields) {
            buttons.getClass();
            unknownFields.getClass();
            return new SupportOptions(header_text, buttons, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SupportOptions)) {
                return false;
            }
            SupportOptions supportOptions = (SupportOptions) other;
            return Intrinsics.areEqual(unknownFields(), supportOptions.unknownFields()) && Intrinsics.areEqual(this.header_text, supportOptions.header_text) && Intrinsics.areEqual(this.buttons, supportOptions.buttons);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_text;
            int hashCode2 = this.buttons.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_text = this.header_text;
            builder.buttons = this.buttons;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
            }
            if (!this.buttons.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("buttons=", arrayList, this.buttons);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SupportOptions{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$SupportOptions;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SupportOptions build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SupportOptions(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public SupportOptions() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride$Builder;", "hide", "", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;Lokio/ByteString;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ThreadedButtonOverride extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ThreadedButtonOverride> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$InlinePaymentHistoryButton#ADAPTER", schemaIndex = 1, tag = 2)
        public final InlinePaymentHistoryButton button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
        public final Boolean hide;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "<init>", "()V", "hide", "", "Ljava/lang/Boolean;", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$InlinePaymentHistoryButton;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public InlinePaymentHistoryButton button;
            public Boolean hide;

            @Override // com.squareup.wire.Message.Builder
            public ThreadedButtonOverride build() {
                return new ThreadedButtonOverride(this.hide, this.button, buildUnknownFields());
            }

            public final Builder button(InlinePaymentHistoryButton button) {
                this.button = button;
                return this;
            }

            public final Builder hide(Boolean hide) {
                this.hide = hide;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreadedButtonOverride.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$ThreadedButtonOverride$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.ThreadedButtonOverride decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentHistoryData.ThreadedButtonOverride((Boolean) obj, (PaymentHistoryData.InlinePaymentHistoryButton) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(PaymentHistoryData.InlinePaymentHistoryButton.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryData.ThreadedButtonOverride value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.hide);
                    PaymentHistoryData.InlinePaymentHistoryButton.ADAPTER.encodeWithTag(writer, 2, value.button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryData.ThreadedButtonOverride value) {
                    value.getClass();
                    return PaymentHistoryData.InlinePaymentHistoryButton.ADAPTER.encodedSizeWithTag(2, value.button) + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.hide) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryData.ThreadedButtonOverride redact(PaymentHistoryData.ThreadedButtonOverride value) {
                    value.getClass();
                    PaymentHistoryData.InlinePaymentHistoryButton inlinePaymentHistoryButton = value.button;
                    return PaymentHistoryData.ThreadedButtonOverride.copy$default(value, null, inlinePaymentHistoryButton != null ? (PaymentHistoryData.InlinePaymentHistoryButton) PaymentHistoryData.InlinePaymentHistoryButton.ADAPTER.redact(inlinePaymentHistoryButton) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryData.ThreadedButtonOverride value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentHistoryData.InlinePaymentHistoryButton.ADAPTER.encodeWithTag(writer, 2, value.button);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.hide);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ThreadedButtonOverride(Boolean bool, InlinePaymentHistoryButton inlinePaymentHistoryButton, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : inlinePaymentHistoryButton, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ThreadedButtonOverride copy$default(ThreadedButtonOverride threadedButtonOverride, Boolean bool, InlinePaymentHistoryButton inlinePaymentHistoryButton, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = threadedButtonOverride.hide;
            }
            if ((i & 2) != 0) {
                inlinePaymentHistoryButton = threadedButtonOverride.button;
            }
            if ((i & 4) != 0) {
                byteString = threadedButtonOverride.unknownFields();
            }
            return threadedButtonOverride.copy(bool, inlinePaymentHistoryButton, byteString);
        }

        public final ThreadedButtonOverride copy(Boolean hide, InlinePaymentHistoryButton button, ByteString unknownFields) {
            unknownFields.getClass();
            return new ThreadedButtonOverride(hide, button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ThreadedButtonOverride)) {
                return false;
            }
            ThreadedButtonOverride threadedButtonOverride = (ThreadedButtonOverride) other;
            return Intrinsics.areEqual(unknownFields(), threadedButtonOverride.unknownFields()) && Intrinsics.areEqual(this.hide, threadedButtonOverride.hide) && Intrinsics.areEqual(this.button, threadedButtonOverride.button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.hide;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            InlinePaymentHistoryButton inlinePaymentHistoryButton = this.button;
            int hashCode3 = hashCode2 + (inlinePaymentHistoryButton != null ? inlinePaymentHistoryButton.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.hide = this.hide;
            builder.button = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.hide;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("hide=", bool, arrayList);
            }
            InlinePaymentHistoryButton inlinePaymentHistoryButton = this.button;
            if (inlinePaymentHistoryButton != null) {
                arrayList.add("button=" + inlinePaymentHistoryButton);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ThreadedButtonOverride{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData$ThreadedButtonOverride;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ThreadedButtonOverride build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ThreadedButtonOverride() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreadedButtonOverride(Boolean bool, InlinePaymentHistoryButton inlinePaymentHistoryButton, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.hide = bool;
            this.button = inlinePaymentHistoryButton;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CUSTOMER", "FAILED", "PENDING", "COMPLETED", "SECURITY", "NONE", "GREY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UiStatusTreatment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UiStatusTreatment[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final UiStatusTreatment CUSTOMER = new UiStatusTreatment("CUSTOMER", 0, 1);
        public static final UiStatusTreatment FAILED = new UiStatusTreatment("FAILED", 1, 2);
        public static final UiStatusTreatment PENDING = new UiStatusTreatment("PENDING", 2, 3);
        public static final UiStatusTreatment COMPLETED = new UiStatusTreatment("COMPLETED", 3, 4);
        public static final UiStatusTreatment SECURITY = new UiStatusTreatment("SECURITY", 4, 5);
        public static final UiStatusTreatment NONE = new UiStatusTreatment("NONE", 5, 6);
        public static final UiStatusTreatment GREY = new UiStatusTreatment("GREY", 6, 7);

        private static final /* synthetic */ UiStatusTreatment[] $values() {
            return new UiStatusTreatment[]{CUSTOMER, FAILED, PENDING, COMPLETED, SECURITY, NONE, GREY};
        }

        static {
            UiStatusTreatment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiStatusTreatment.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryData$UiStatusTreatment$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryData.UiStatusTreatment fromValue(int value) {
                    return PaymentHistoryData.UiStatusTreatment.INSTANCE.fromValue(value);
                }
            };
        }

        private UiStatusTreatment(String str, int i, int i2) {
            this.value = i2;
        }

        public static final UiStatusTreatment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static UiStatusTreatment valueOf(String str) {
            return (UiStatusTreatment) Enum.valueOf(UiStatusTreatment.class, str);
        }

        public static UiStatusTreatment[] values() {
            return (UiStatusTreatment[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UiStatusTreatment fromValue(int value) {
                switch (value) {
                    case 1:
                        return UiStatusTreatment.CUSTOMER;
                    case 2:
                        return UiStatusTreatment.FAILED;
                    case 3:
                        return UiStatusTreatment.PENDING;
                    case 4:
                        return UiStatusTreatment.COMPLETED;
                    case 5:
                        return UiStatusTreatment.SECURITY;
                    case 6:
                        return UiStatusTreatment.NONE;
                    case 7:
                        return UiStatusTreatment.GREY;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "DEFAULT_ICON_OVERLAY_SHAPE", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$IconOverlayShape;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentHistoryData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
