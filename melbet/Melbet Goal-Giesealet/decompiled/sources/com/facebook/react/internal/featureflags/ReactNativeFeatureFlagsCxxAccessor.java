package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactNativeFeatureFlagsCxxAccessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bD\n\u0002\u0010\u0006\n\u0002\bv\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010d\u001a\u00020\u0005H\u0016J\b\u0010e\u001a\u00020\u0005H\u0016J\b\u0010f\u001a\u00020\u0005H\u0016J\b\u0010g\u001a\u00020\u0005H\u0016J\b\u0010h\u001a\u00020\u0005H\u0016J\b\u0010i\u001a\u00020\u0005H\u0016J\b\u0010j\u001a\u00020\u0005H\u0016J\b\u0010k\u001a\u00020\u0005H\u0016J\b\u0010l\u001a\u00020\u0005H\u0016J\b\u0010m\u001a\u00020\u0005H\u0016J\b\u0010n\u001a\u00020\u0005H\u0016J\b\u0010o\u001a\u00020\u0005H\u0016J\b\u0010p\u001a\u00020\u0005H\u0016J\b\u0010q\u001a\u00020\u0005H\u0016J\b\u0010r\u001a\u00020\u0005H\u0016J\b\u0010s\u001a\u00020\u0005H\u0016J\b\u0010t\u001a\u00020\u0005H\u0016J\b\u0010u\u001a\u00020\u0005H\u0016J\b\u0010v\u001a\u00020\u0005H\u0016J\b\u0010w\u001a\u00020\u0005H\u0016J\b\u0010x\u001a\u00020\u0005H\u0016J\b\u0010y\u001a\u00020\u0005H\u0016J\b\u0010z\u001a\u00020\u0005H\u0016J\b\u0010{\u001a\u00020\u0005H\u0016J\b\u0010|\u001a\u00020\u0005H\u0016J\b\u0010}\u001a\u00020\u0005H\u0016J\b\u0010~\u001a\u00020\u0005H\u0016J\b\u0010\u007f\u001a\u00020\u0005H\u0016J\t\u0010\u0080\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0081\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0082\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0083\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0084\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0085\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0086\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0087\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0088\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0089\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008a\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008b\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008c\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008d\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008e\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0090\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0091\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0093\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0094\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0095\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0096\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0097\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0098\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u0099\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009a\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009d\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009e\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u009f\u0001\u001a\u00020\u0005H\u0016J\t\u0010 \u0001\u001a\u00020\u0005H\u0016J\t\u0010¡\u0001\u001a\u00020\u0005H\u0016J\t\u0010¢\u0001\u001a\u00020\u0005H\u0016J\t\u0010£\u0001\u001a\u00020\u0005H\u0016J\t\u0010¤\u0001\u001a\u00020\u0005H\u0016J\t\u0010¥\u0001\u001a\u00020\u0005H\u0016J\t\u0010¦\u0001\u001a\u00020\u0005H\u0016J\t\u0010§\u0001\u001a\u00020JH\u0016J\t\u0010¨\u0001\u001a\u00020\u0005H\u0016J\t\u0010©\u0001\u001a\u00020\u0005H\u0016J\t\u0010ª\u0001\u001a\u00020\u0005H\u0016J\t\u0010«\u0001\u001a\u00020\u0005H\u0016J\t\u0010¬\u0001\u001a\u00020\u0005H\u0016J\t\u0010\u00ad\u0001\u001a\u00020\u0005H\u0016J\t\u0010®\u0001\u001a\u00020\u0005H\u0016J\t\u0010¯\u0001\u001a\u00020\u0005H\u0016J\t\u0010°\u0001\u001a\u00020\u0005H\u0016J\t\u0010±\u0001\u001a\u00020\u0005H\u0016J\t\u0010²\u0001\u001a\u00020\u0005H\u0016J\t\u0010³\u0001\u001a\u00020\u0005H\u0016J\t\u0010´\u0001\u001a\u00020\u0005H\u0016J\t\u0010µ\u0001\u001a\u00020\u0005H\u0016J\t\u0010¶\u0001\u001a\u00020\u0005H\u0016J\t\u0010·\u0001\u001a\u00020\u0005H\u0016J\t\u0010¸\u0001\u001a\u00020\u0005H\u0016J\t\u0010¹\u0001\u001a\u00020\u0005H\u0016J\t\u0010º\u0001\u001a\u00020\u0005H\u0016J\t\u0010»\u0001\u001a\u00020\u0005H\u0016J\t\u0010¼\u0001\u001a\u00020\u0005H\u0016J\t\u0010½\u0001\u001a\u00020JH\u0016J\t\u0010¾\u0001\u001a\u00020\u0005H\u0016J\t\u0010¿\u0001\u001a\u00020JH\u0016J\u0014\u0010À\u0001\u001a\u00030Á\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001H\u0016J\n\u0010Ä\u0001\u001a\u00030Á\u0001H\u0016J\u0016\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001H\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010 \u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010!\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010#\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010$\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010%\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010&\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010'\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010(\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010)\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010*\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010+\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010,\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010-\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010.\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010/\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00100\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00101\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00102\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00103\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00104\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00105\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00106\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00107\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00108\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u00109\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010:\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010;\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010<\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010=\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010>\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010?\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010@\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010A\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010B\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010C\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010D\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010E\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010F\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010G\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010H\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0004\n\u0002\u0010KR\u0012\u0010L\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010M\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010N\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010O\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010P\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010Q\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010R\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010S\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010T\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010U\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010V\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010W\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010X\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010Y\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010Z\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010[\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\\\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010]\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010^\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010_\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010`\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010a\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0004\n\u0002\u0010KR\u0012\u0010b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010c\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0004\n\u0002\u0010K¨\u0006Ç\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "<init>", "()V", "commonTestFlagCache", "", "Ljava/lang/Boolean;", "cdpInteractionMetricsEnabledCache", "cxxNativeAnimatedEnabledCache", "defaultTextToOverflowHiddenCache", "disableEarlyViewCommandExecutionCache", "disableImageViewPreallocationAndroidCache", "disableMountItemReorderingAndroidCache", "disableSubviewClippingAndroidCache", "disableTextLayoutManagerCacheAndroidCache", "disableViewPreallocationAndroidCache", "enableAccessibilityOrderCache", "enableAccumulatedUpdatesInRawPropsAndroidCache", "enableAndroidTextMeasurementOptimizationsCache", "enableBridgelessArchitectureCache", "enableCppPropsIteratorSetterCache", "enableCustomFocusSearchOnClippedElementsAndroidCache", "enableDestroyShadowTreeRevisionAsyncCache", "enableDifferentiatorMutationVectorPreallocationCache", "enableDoubleMeasurementFixAndroidCache", "enableEagerMainQueueModulesOnIOSCache", "enableEagerRootViewAttachmentCache", "enableExclusivePropsUpdateAndroidCache", "enableFabricCommitBranchingCache", "enableFabricLogsCache", "enableFabricRendererCache", "enableFontScaleChangesUpdatingLayoutCache", "enableIOSTextBaselineOffsetPerLineCache", "enableIOSViewClipToPaddingBoxCache", "enableImagePrefetchingAndroidCache", "enableImmediateUpdateModeForContentOffsetChangesCache", "enableImperativeFocusCache", "enableInteropViewManagerClassLookUpOptimizationIOSCache", "enableIntersectionObserverByDefaultCache", "enableKeyEventsCache", "enableLayoutAnimationsOnAndroidCache", "enableLayoutAnimationsOnIOSCache", "enableMainQueueCoordinatorOnIOSCache", "enableModuleArgumentNSNullConversionIOSCache", "enableMutationObserverByDefaultCache", "enableNativeCSSParsingCache", "enableNativeViewPropTransformationsCache", "enableNetworkEventReportingCache", "enablePreparedTextLayoutCache", "enablePropsUpdateReconciliationAndroidCache", "enableSchedulerDelegateInvalidationCache", "enableSwiftUIBasedFiltersCache", "enableViewCullingCache", "enableViewRecyclingCache", "enableViewRecyclingForImageCache", "enableViewRecyclingForScrollViewCache", "enableViewRecyclingForTextCache", "enableViewRecyclingForViewCache", "enableVirtualViewContainerStateExperimentalCache", "enableVirtualViewDebugFeaturesCache", "fixDifferentiatorParentTagForUnflattenCaseCache", "fixFindShadowNodeByTagRaceConditionCache", "fixMappingOfEventPrioritiesBetweenFabricAndReactCache", "fixYogaFlexBasisFitContentInMainAxisCache", "fuseboxAssertSingleHostStateCache", "fuseboxEnabledReleaseCache", "fuseboxFrameRecordingEnabledCache", "fuseboxNetworkInspectionEnabledCache", "fuseboxScreenshotCaptureEnabledCache", "hideOffscreenVirtualViewsOnIOSCache", "overrideBySynchronousMountPropsAtMountingAndroidCache", "perfIssuesEnabledCache", "perfMonitorV2EnabledCache", "preparedTextCacheSizeCache", "", "Ljava/lang/Double;", "preventShadowTreeCommitExhaustionCache", "redBoxV2AndroidCache", "redBoxV2IOSCache", "shouldPressibilityUseW3CPointerEventsForHoverCache", "shouldTriggerResponderTransferOnScrollAndroidCache", "skipActivityIdentityAssertionOnHostPauseCache", "syncAndroidClipBoundsWithOverflowCache", "traceTurboModulePromiseRejectionsOnAndroidCache", "updateRuntimeShadowNodeReferencesOnCommitCache", "updateRuntimeShadowNodeReferencesOnCommitThreadCache", "useAlwaysAvailableJSErrorHandlingCache", "useFabricInteropCache", "useLISAlgorithmInDifferentiatorCache", "useNativeViewConfigsInBridgelessModeCache", "useNestedScrollViewAndroidCache", "useOptimizedViewRegistryOnAndroidCache", "useSharedAnimatedBackendCache", "useTraitHiddenOnAndroidCache", "useTurboModuleInteropCache", "useTurboModulesCache", "useUnorderedMapInDifferentiatorCache", "viewCullingOutsetRatioCache", "viewTransitionEnabledCache", "virtualViewPrerenderRatioCache", "commonTestFlag", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "defaultTextToOverflowHidden", "disableEarlyViewCommandExecution", "disableImageViewPreallocationAndroid", "disableMountItemReorderingAndroid", "disableSubviewClippingAndroid", "disableTextLayoutManagerCacheAndroid", "disableViewPreallocationAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDifferentiatorMutationVectorPreallocation", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableExclusivePropsUpdateAndroid", "enableFabricCommitBranching", "enableFabricLogs", "enableFabricRenderer", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableMutationObserverByDefault", "enableNativeCSSParsing", "enableNativeViewPropTransformations", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableSchedulerDelegateInvalidation", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "fixDifferentiatorParentTagForUnflattenCase", "fixFindShadowNodeByTagRaceCondition", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixYogaFlexBasisFitContentInMainAxis", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxFrameRecordingEnabled", "fuseboxNetworkInspectionEnabled", "fuseboxScreenshotCaptureEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", "preparedTextCacheSize", "preventShadowTreeCommitExhaustion", "redBoxV2Android", "redBoxV2IOS", "shouldPressibilityUseW3CPointerEventsForHover", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "syncAndroidClipBoundsWithOverflow", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "updateRuntimeShadowNodeReferencesOnCommitThread", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useLISAlgorithmInDifferentiator", "useNativeViewConfigsInBridgelessMode", "useNestedScrollViewAndroid", "useOptimizedViewRegistryOnAndroid", "useSharedAnimatedBackend", "useTraitHiddenOnAndroid", "useTurboModuleInterop", "useTurboModules", "useUnorderedMapInDifferentiator", "viewCullingOutsetRatio", "viewTransitionEnabled", "virtualViewPrerenderRatio", "override", "", "provider", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "dangerouslyReset", "dangerouslyForceOverride", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReactNativeFeatureFlagsCxxAccessor implements ReactNativeFeatureFlagsAccessor {
    private Boolean cdpInteractionMetricsEnabledCache;
    private Boolean commonTestFlagCache;
    private Boolean cxxNativeAnimatedEnabledCache;
    private Boolean defaultTextToOverflowHiddenCache;
    private Boolean disableEarlyViewCommandExecutionCache;
    private Boolean disableImageViewPreallocationAndroidCache;
    private Boolean disableMountItemReorderingAndroidCache;
    private Boolean disableSubviewClippingAndroidCache;
    private Boolean disableTextLayoutManagerCacheAndroidCache;
    private Boolean disableViewPreallocationAndroidCache;
    private Boolean enableAccessibilityOrderCache;
    private Boolean enableAccumulatedUpdatesInRawPropsAndroidCache;
    private Boolean enableAndroidTextMeasurementOptimizationsCache;
    private Boolean enableBridgelessArchitectureCache;
    private Boolean enableCppPropsIteratorSetterCache;
    private Boolean enableCustomFocusSearchOnClippedElementsAndroidCache;
    private Boolean enableDestroyShadowTreeRevisionAsyncCache;
    private Boolean enableDifferentiatorMutationVectorPreallocationCache;
    private Boolean enableDoubleMeasurementFixAndroidCache;
    private Boolean enableEagerMainQueueModulesOnIOSCache;
    private Boolean enableEagerRootViewAttachmentCache;
    private Boolean enableExclusivePropsUpdateAndroidCache;
    private Boolean enableFabricCommitBranchingCache;
    private Boolean enableFabricLogsCache;
    private Boolean enableFabricRendererCache;
    private Boolean enableFontScaleChangesUpdatingLayoutCache;
    private Boolean enableIOSTextBaselineOffsetPerLineCache;
    private Boolean enableIOSViewClipToPaddingBoxCache;
    private Boolean enableImagePrefetchingAndroidCache;
    private Boolean enableImmediateUpdateModeForContentOffsetChangesCache;
    private Boolean enableImperativeFocusCache;
    private Boolean enableInteropViewManagerClassLookUpOptimizationIOSCache;
    private Boolean enableIntersectionObserverByDefaultCache;
    private Boolean enableKeyEventsCache;
    private Boolean enableLayoutAnimationsOnAndroidCache;
    private Boolean enableLayoutAnimationsOnIOSCache;
    private Boolean enableMainQueueCoordinatorOnIOSCache;
    private Boolean enableModuleArgumentNSNullConversionIOSCache;
    private Boolean enableMutationObserverByDefaultCache;
    private Boolean enableNativeCSSParsingCache;
    private Boolean enableNativeViewPropTransformationsCache;
    private Boolean enableNetworkEventReportingCache;
    private Boolean enablePreparedTextLayoutCache;
    private Boolean enablePropsUpdateReconciliationAndroidCache;
    private Boolean enableSchedulerDelegateInvalidationCache;
    private Boolean enableSwiftUIBasedFiltersCache;
    private Boolean enableViewCullingCache;
    private Boolean enableViewRecyclingCache;
    private Boolean enableViewRecyclingForImageCache;
    private Boolean enableViewRecyclingForScrollViewCache;
    private Boolean enableViewRecyclingForTextCache;
    private Boolean enableViewRecyclingForViewCache;
    private Boolean enableVirtualViewContainerStateExperimentalCache;
    private Boolean enableVirtualViewDebugFeaturesCache;
    private Boolean fixDifferentiatorParentTagForUnflattenCaseCache;
    private Boolean fixFindShadowNodeByTagRaceConditionCache;
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
    private Boolean fixYogaFlexBasisFitContentInMainAxisCache;
    private Boolean fuseboxAssertSingleHostStateCache;
    private Boolean fuseboxEnabledReleaseCache;
    private Boolean fuseboxFrameRecordingEnabledCache;
    private Boolean fuseboxNetworkInspectionEnabledCache;
    private Boolean fuseboxScreenshotCaptureEnabledCache;
    private Boolean hideOffscreenVirtualViewsOnIOSCache;
    private Boolean overrideBySynchronousMountPropsAtMountingAndroidCache;
    private Boolean perfIssuesEnabledCache;
    private Boolean perfMonitorV2EnabledCache;
    private Double preparedTextCacheSizeCache;
    private Boolean preventShadowTreeCommitExhaustionCache;
    private Boolean redBoxV2AndroidCache;
    private Boolean redBoxV2IOSCache;
    private Boolean shouldPressibilityUseW3CPointerEventsForHoverCache;
    private Boolean shouldTriggerResponderTransferOnScrollAndroidCache;
    private Boolean skipActivityIdentityAssertionOnHostPauseCache;
    private Boolean syncAndroidClipBoundsWithOverflowCache;
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;
    private Boolean updateRuntimeShadowNodeReferencesOnCommitCache;
    private Boolean updateRuntimeShadowNodeReferencesOnCommitThreadCache;
    private Boolean useAlwaysAvailableJSErrorHandlingCache;
    private Boolean useFabricInteropCache;
    private Boolean useLISAlgorithmInDifferentiatorCache;
    private Boolean useNativeViewConfigsInBridgelessModeCache;
    private Boolean useNestedScrollViewAndroidCache;
    private Boolean useOptimizedViewRegistryOnAndroidCache;
    private Boolean useSharedAnimatedBackendCache;
    private Boolean useTraitHiddenOnAndroidCache;
    private Boolean useTurboModuleInteropCache;
    private Boolean useTurboModulesCache;
    private Boolean useUnorderedMapInDifferentiatorCache;
    private Double viewCullingOutsetRatioCache;
    private Boolean viewTransitionEnabledCache;
    private Double virtualViewPrerenderRatioCache;

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean bool = this.commonTestFlagCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.commonTestFlagCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cdpInteractionMetricsEnabled() {
        Boolean bool = this.cdpInteractionMetricsEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.cdpInteractionMetricsEnabled());
            this.cdpInteractionMetricsEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedEnabled() {
        Boolean bool = this.cxxNativeAnimatedEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.cxxNativeAnimatedEnabled());
            this.cxxNativeAnimatedEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean defaultTextToOverflowHidden() {
        Boolean bool = this.defaultTextToOverflowHiddenCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.defaultTextToOverflowHidden());
            this.defaultTextToOverflowHiddenCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableEarlyViewCommandExecution() {
        Boolean bool = this.disableEarlyViewCommandExecutionCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableEarlyViewCommandExecution());
            this.disableEarlyViewCommandExecutionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableImageViewPreallocationAndroid() {
        Boolean bool = this.disableImageViewPreallocationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableImageViewPreallocationAndroid());
            this.disableImageViewPreallocationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean bool = this.disableMountItemReorderingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableMountItemReorderingAndroid());
            this.disableMountItemReorderingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableSubviewClippingAndroid() {
        Boolean bool = this.disableSubviewClippingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableSubviewClippingAndroid());
            this.disableSubviewClippingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableTextLayoutManagerCacheAndroid() {
        Boolean bool = this.disableTextLayoutManagerCacheAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableTextLayoutManagerCacheAndroid());
            this.disableTextLayoutManagerCacheAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableViewPreallocationAndroid() {
        Boolean bool = this.disableViewPreallocationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableViewPreallocationAndroid());
            this.disableViewPreallocationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccessibilityOrder() {
        Boolean bool = this.enableAccessibilityOrderCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAccessibilityOrder());
            this.enableAccessibilityOrderCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean bool = this.enableAccumulatedUpdatesInRawPropsAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAccumulatedUpdatesInRawPropsAndroid());
            this.enableAccumulatedUpdatesInRawPropsAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidTextMeasurementOptimizations() {
        Boolean bool = this.enableAndroidTextMeasurementOptimizationsCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAndroidTextMeasurementOptimizations());
            this.enableAndroidTextMeasurementOptimizationsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        Boolean bool = this.enableBridgelessArchitectureCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBridgelessArchitecture());
            this.enableBridgelessArchitectureCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean bool = this.enableCppPropsIteratorSetterCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCppPropsIteratorSetter());
            this.enableCppPropsIteratorSetterCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        Boolean bool = this.enableCustomFocusSearchOnClippedElementsAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCustomFocusSearchOnClippedElementsAndroid());
            this.enableCustomFocusSearchOnClippedElementsAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDestroyShadowTreeRevisionAsync() {
        Boolean bool = this.enableDestroyShadowTreeRevisionAsyncCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableDestroyShadowTreeRevisionAsync());
            this.enableDestroyShadowTreeRevisionAsyncCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDifferentiatorMutationVectorPreallocation() {
        Boolean bool = this.enableDifferentiatorMutationVectorPreallocationCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableDifferentiatorMutationVectorPreallocation());
            this.enableDifferentiatorMutationVectorPreallocationCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDoubleMeasurementFixAndroid() {
        Boolean bool = this.enableDoubleMeasurementFixAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableDoubleMeasurementFixAndroid());
            this.enableDoubleMeasurementFixAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerMainQueueModulesOnIOS() {
        Boolean bool = this.enableEagerMainQueueModulesOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerMainQueueModulesOnIOS());
            this.enableEagerMainQueueModulesOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean bool = this.enableEagerRootViewAttachmentCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.enableEagerRootViewAttachmentCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableExclusivePropsUpdateAndroid() {
        Boolean bool = this.enableExclusivePropsUpdateAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableExclusivePropsUpdateAndroid());
            this.enableExclusivePropsUpdateAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricCommitBranching() {
        Boolean bool = this.enableFabricCommitBranchingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricCommitBranching());
            this.enableFabricCommitBranchingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean bool = this.enableFabricLogsCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.enableFabricLogsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean bool = this.enableFabricRendererCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRenderer());
            this.enableFabricRendererCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFontScaleChangesUpdatingLayout() {
        Boolean bool = this.enableFontScaleChangesUpdatingLayoutCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFontScaleChangesUpdatingLayout());
            this.enableFontScaleChangesUpdatingLayoutCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSTextBaselineOffsetPerLine() {
        Boolean bool = this.enableIOSTextBaselineOffsetPerLineCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSTextBaselineOffsetPerLine());
            this.enableIOSTextBaselineOffsetPerLineCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean bool = this.enableIOSViewClipToPaddingBoxCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.enableIOSViewClipToPaddingBoxCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean bool = this.enableImagePrefetchingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableImagePrefetchingAndroid());
            this.enableImagePrefetchingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImmediateUpdateModeForContentOffsetChanges() {
        Boolean bool = this.enableImmediateUpdateModeForContentOffsetChangesCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableImmediateUpdateModeForContentOffsetChanges());
            this.enableImmediateUpdateModeForContentOffsetChangesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImperativeFocus() {
        Boolean bool = this.enableImperativeFocusCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableImperativeFocus());
            this.enableImperativeFocusCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        Boolean bool = this.enableInteropViewManagerClassLookUpOptimizationIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableInteropViewManagerClassLookUpOptimizationIOS());
            this.enableInteropViewManagerClassLookUpOptimizationIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIntersectionObserverByDefault() {
        Boolean bool = this.enableIntersectionObserverByDefaultCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIntersectionObserverByDefault());
            this.enableIntersectionObserverByDefaultCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableKeyEvents() {
        Boolean bool = this.enableKeyEventsCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableKeyEvents());
            this.enableKeyEventsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean bool = this.enableLayoutAnimationsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnAndroid());
            this.enableLayoutAnimationsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean bool = this.enableLayoutAnimationsOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.enableLayoutAnimationsOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMainQueueCoordinatorOnIOS() {
        Boolean bool = this.enableMainQueueCoordinatorOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMainQueueCoordinatorOnIOS());
            this.enableMainQueueCoordinatorOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableModuleArgumentNSNullConversionIOS() {
        Boolean bool = this.enableModuleArgumentNSNullConversionIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableModuleArgumentNSNullConversionIOS());
            this.enableModuleArgumentNSNullConversionIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMutationObserverByDefault() {
        Boolean bool = this.enableMutationObserverByDefaultCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMutationObserverByDefault());
            this.enableMutationObserverByDefaultCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        Boolean bool = this.enableNativeCSSParsingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNativeCSSParsing());
            this.enableNativeCSSParsingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeViewPropTransformations() {
        Boolean bool = this.enableNativeViewPropTransformationsCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNativeViewPropTransformations());
            this.enableNativeViewPropTransformationsCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNetworkEventReporting() {
        Boolean bool = this.enableNetworkEventReportingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNetworkEventReporting());
            this.enableNetworkEventReportingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreparedTextLayout() {
        Boolean bool = this.enablePreparedTextLayoutCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePreparedTextLayout());
            this.enablePreparedTextLayoutCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean bool = this.enablePropsUpdateReconciliationAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.enablePropsUpdateReconciliationAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSchedulerDelegateInvalidation() {
        Boolean bool = this.enableSchedulerDelegateInvalidationCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSchedulerDelegateInvalidation());
            this.enableSchedulerDelegateInvalidationCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSwiftUIBasedFilters() {
        Boolean bool = this.enableSwiftUIBasedFiltersCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSwiftUIBasedFilters());
            this.enableSwiftUIBasedFiltersCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        Boolean bool = this.enableViewCullingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewCulling());
            this.enableViewCullingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean bool = this.enableViewRecyclingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.enableViewRecyclingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForImage() {
        Boolean bool = this.enableViewRecyclingForImageCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForImage());
            this.enableViewRecyclingForImageCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForScrollView() {
        Boolean bool = this.enableViewRecyclingForScrollViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForScrollView());
            this.enableViewRecyclingForScrollViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        Boolean bool = this.enableViewRecyclingForTextCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForText());
            this.enableViewRecyclingForTextCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        Boolean bool = this.enableViewRecyclingForViewCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForView());
            this.enableViewRecyclingForViewCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewContainerStateExperimental() {
        Boolean bool = this.enableVirtualViewContainerStateExperimentalCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableVirtualViewContainerStateExperimental());
            this.enableVirtualViewContainerStateExperimentalCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewDebugFeatures() {
        Boolean bool = this.enableVirtualViewDebugFeaturesCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableVirtualViewDebugFeatures());
            this.enableVirtualViewDebugFeaturesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixDifferentiatorParentTagForUnflattenCase() {
        Boolean bool = this.fixDifferentiatorParentTagForUnflattenCaseCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixDifferentiatorParentTagForUnflattenCase());
            this.fixDifferentiatorParentTagForUnflattenCaseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixFindShadowNodeByTagRaceCondition() {
        Boolean bool = this.fixFindShadowNodeByTagRaceConditionCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixFindShadowNodeByTagRaceCondition());
            this.fixFindShadowNodeByTagRaceConditionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean bool = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixYogaFlexBasisFitContentInMainAxis() {
        Boolean bool = this.fixYogaFlexBasisFitContentInMainAxisCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixYogaFlexBasisFitContentInMainAxis());
            this.fixYogaFlexBasisFitContentInMainAxisCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxAssertSingleHostState() {
        Boolean bool = this.fuseboxAssertSingleHostStateCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxAssertSingleHostState());
            this.fuseboxAssertSingleHostStateCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean bool = this.fuseboxEnabledReleaseCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.fuseboxEnabledReleaseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxFrameRecordingEnabled() {
        Boolean bool = this.fuseboxFrameRecordingEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxFrameRecordingEnabled());
            this.fuseboxFrameRecordingEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        Boolean bool = this.fuseboxNetworkInspectionEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxNetworkInspectionEnabled());
            this.fuseboxNetworkInspectionEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxScreenshotCaptureEnabled() {
        Boolean bool = this.fuseboxScreenshotCaptureEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxScreenshotCaptureEnabled());
            this.fuseboxScreenshotCaptureEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean hideOffscreenVirtualViewsOnIOS() {
        Boolean bool = this.hideOffscreenVirtualViewsOnIOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.hideOffscreenVirtualViewsOnIOS());
            this.hideOffscreenVirtualViewsOnIOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean overrideBySynchronousMountPropsAtMountingAndroid() {
        Boolean bool = this.overrideBySynchronousMountPropsAtMountingAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.overrideBySynchronousMountPropsAtMountingAndroid());
            this.overrideBySynchronousMountPropsAtMountingAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfIssuesEnabled() {
        Boolean bool = this.perfIssuesEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.perfIssuesEnabled());
            this.perfIssuesEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean perfMonitorV2Enabled() {
        Boolean bool = this.perfMonitorV2EnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.perfMonitorV2Enabled());
            this.perfMonitorV2EnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double preparedTextCacheSize() {
        Double d = this.preparedTextCacheSizeCache;
        if (d == null) {
            d = Double.valueOf(ReactNativeFeatureFlagsCxxInterop.preparedTextCacheSize());
            this.preparedTextCacheSizeCache = d;
        }
        return d.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventShadowTreeCommitExhaustion() {
        Boolean bool = this.preventShadowTreeCommitExhaustionCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.preventShadowTreeCommitExhaustion());
            this.preventShadowTreeCommitExhaustionCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean redBoxV2Android() {
        Boolean bool = this.redBoxV2AndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.redBoxV2Android());
            this.redBoxV2AndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean redBoxV2IOS() {
        Boolean bool = this.redBoxV2IOSCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.redBoxV2IOS());
            this.redBoxV2IOSCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldPressibilityUseW3CPointerEventsForHover() {
        Boolean bool = this.shouldPressibilityUseW3CPointerEventsForHoverCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.shouldPressibilityUseW3CPointerEventsForHover());
            this.shouldPressibilityUseW3CPointerEventsForHoverCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean shouldTriggerResponderTransferOnScrollAndroid() {
        Boolean bool = this.shouldTriggerResponderTransferOnScrollAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.shouldTriggerResponderTransferOnScrollAndroid());
            this.shouldTriggerResponderTransferOnScrollAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean skipActivityIdentityAssertionOnHostPause() {
        Boolean bool = this.skipActivityIdentityAssertionOnHostPauseCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.skipActivityIdentityAssertionOnHostPause());
            this.skipActivityIdentityAssertionOnHostPauseCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean syncAndroidClipBoundsWithOverflow() {
        Boolean bool = this.syncAndroidClipBoundsWithOverflowCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.syncAndroidClipBoundsWithOverflow());
            this.syncAndroidClipBoundsWithOverflowCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean bool = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.traceTurboModulePromiseRejectionsOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommit() {
        Boolean bool = this.updateRuntimeShadowNodeReferencesOnCommitCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.updateRuntimeShadowNodeReferencesOnCommit());
            this.updateRuntimeShadowNodeReferencesOnCommitCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommitThread() {
        Boolean bool = this.updateRuntimeShadowNodeReferencesOnCommitThreadCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.updateRuntimeShadowNodeReferencesOnCommitThread());
            this.updateRuntimeShadowNodeReferencesOnCommitThreadCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean bool = this.useAlwaysAvailableJSErrorHandlingCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useAlwaysAvailableJSErrorHandling());
            this.useAlwaysAvailableJSErrorHandlingCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean bool = this.useFabricInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.useFabricInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useLISAlgorithmInDifferentiator() {
        Boolean bool = this.useLISAlgorithmInDifferentiatorCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useLISAlgorithmInDifferentiator());
            this.useLISAlgorithmInDifferentiatorCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean bool = this.useNativeViewConfigsInBridgelessModeCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.useNativeViewConfigsInBridgelessModeCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNestedScrollViewAndroid() {
        Boolean bool = this.useNestedScrollViewAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNestedScrollViewAndroid());
            this.useNestedScrollViewAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedViewRegistryOnAndroid() {
        Boolean bool = this.useOptimizedViewRegistryOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedViewRegistryOnAndroid());
            this.useOptimizedViewRegistryOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useSharedAnimatedBackend() {
        Boolean bool = this.useSharedAnimatedBackendCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useSharedAnimatedBackend());
            this.useSharedAnimatedBackendCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTraitHiddenOnAndroid() {
        Boolean bool = this.useTraitHiddenOnAndroidCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTraitHiddenOnAndroid());
            this.useTraitHiddenOnAndroidCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean bool = this.useTurboModuleInteropCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.useTurboModuleInteropCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean bool = this.useTurboModulesCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModules());
            this.useTurboModulesCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useUnorderedMapInDifferentiator() {
        Boolean bool = this.useUnorderedMapInDifferentiatorCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useUnorderedMapInDifferentiator());
            this.useUnorderedMapInDifferentiatorCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double viewCullingOutsetRatio() {
        Double d = this.viewCullingOutsetRatioCache;
        if (d == null) {
            d = Double.valueOf(ReactNativeFeatureFlagsCxxInterop.viewCullingOutsetRatio());
            this.viewCullingOutsetRatioCache = d;
        }
        return d.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean viewTransitionEnabled() {
        Boolean bool = this.viewTransitionEnabledCache;
        if (bool == null) {
            bool = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.viewTransitionEnabled());
            this.viewTransitionEnabledCache = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewPrerenderRatio() {
        Double d = this.virtualViewPrerenderRatioCache;
        if (d == null) {
            d = Double.valueOf(ReactNativeFeatureFlagsCxxInterop.virtualViewPrerenderRatio());
            this.virtualViewPrerenderRatioCache = d;
        }
        return d.doubleValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ReactNativeFeatureFlagsCxxInterop.override(provider);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
        ReactNativeFeatureFlagsCxxInterop.dangerouslyReset();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public String dangerouslyForceOverride(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return ReactNativeFeatureFlagsCxxInterop.dangerouslyForceOverride(provider);
    }
}
