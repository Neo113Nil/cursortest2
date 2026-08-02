package com.squareup.cash.support.chat.backend.real;

import app.cash.badging.backend.Badger$collect$$inlined$combine$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.preferences.KeyValue;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SupportConversationPersistence {
    public final KeyValue lastLoadedMessageTokenKeyValue;
    public final KeyValue lastReadMessageTokenKeyValue;
    public final KeyValue savedInputKeyValue;

    public SupportConversationPersistence(KeyValue keyValue, KeyValue keyValue2, KeyValue keyValue3, KeyValue keyValue4) {
        this.savedInputKeyValue = keyValue;
        this.lastReadMessageTokenKeyValue = keyValue2;
        this.lastLoadedMessageTokenKeyValue = keyValue3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLastReadMessageToken(ContinuationImpl continuationImpl) {
        SupportConversationPersistence$getLastReadMessageToken$1 supportConversationPersistence$getLastReadMessageToken$1;
        int i;
        String str;
        if (continuationImpl instanceof SupportConversationPersistence$getLastReadMessageToken$1) {
            supportConversationPersistence$getLastReadMessageToken$1 = (SupportConversationPersistence$getLastReadMessageToken$1) continuationImpl;
            int i2 = supportConversationPersistence$getLastReadMessageToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportConversationPersistence$getLastReadMessageToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportConversationPersistence$getLastReadMessageToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportConversationPersistence$getLastReadMessageToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    supportConversationPersistence$getLastReadMessageToken$1.label = 1;
                    obj = this.lastReadMessageTokenKeyValue.get(supportConversationPersistence$getLastReadMessageToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ChatLastReadMessageToken chatLastReadMessageToken = (ChatLastReadMessageToken) obj;
                str = chatLastReadMessageToken == null ? chatLastReadMessageToken.token : null;
                if (str != null) {
                    return null;
                }
                return str;
            }
        }
        supportConversationPersistence$getLastReadMessageToken$1 = new SupportConversationPersistence$getLastReadMessageToken$1(this, continuationImpl);
        Object obj2 = supportConversationPersistence$getLastReadMessageToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportConversationPersistence$getLastReadMessageToken$1.label;
        if (i != 0) {
        }
        ChatLastReadMessageToken chatLastReadMessageToken2 = (ChatLastReadMessageToken) obj2;
        if (chatLastReadMessageToken2 == null) {
        }
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSavedInput(ContinuationImpl continuationImpl) {
        SupportConversationPersistence$getSavedInput$1 supportConversationPersistence$getSavedInput$1;
        int i;
        String m3751unboximpl;
        if (continuationImpl instanceof SupportConversationPersistence$getSavedInput$1) {
            supportConversationPersistence$getSavedInput$1 = (SupportConversationPersistence$getSavedInput$1) continuationImpl;
            int i2 = supportConversationPersistence$getSavedInput$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportConversationPersistence$getSavedInput$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportConversationPersistence$getSavedInput$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportConversationPersistence$getSavedInput$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    supportConversationPersistence$getSavedInput$1.label = 1;
                    obj = this.savedInputKeyValue.get(supportConversationPersistence$getSavedInput$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ChatSavedInputPreference chatSavedInputPreference = (ChatSavedInputPreference) obj;
                m3751unboximpl = chatSavedInputPreference == null ? chatSavedInputPreference.m3751unboximpl() : null;
                if (m3751unboximpl != null) {
                    return null;
                }
                return m3751unboximpl;
            }
        }
        supportConversationPersistence$getSavedInput$1 = new SupportConversationPersistence$getSavedInput$1(this, continuationImpl);
        Object obj2 = supportConversationPersistence$getSavedInput$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportConversationPersistence$getSavedInput$1.label;
        if (i != 0) {
        }
        ChatSavedInputPreference chatSavedInputPreference2 = (ChatSavedInputPreference) obj2;
        if (chatSavedInputPreference2 == null) {
        }
        if (m3751unboximpl != null) {
        }
    }

    public final Flow hasUnreadMessages() {
        return FlowKt.distinctUntilChanged(new Badger$collect$$inlined$combine$1(new Flow[]{new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.lastLoadedMessageTokenKeyValue.observe(), 17), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.lastReadMessageTokenKeyValue.observe(), 18)}, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r9.lastReadMessageTokenKeyValue.set(r11, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateLastReadMessageToken(String str, List list, ContinuationImpl continuationImpl) {
        SupportConversationPersistence$updateLastReadMessageToken$1 supportConversationPersistence$updateLastReadMessageToken$1;
        int i;
        String str2;
        ArrayList arrayList;
        ListIterator listIterator;
        int i2;
        String messageToken;
        if (continuationImpl instanceof SupportConversationPersistence$updateLastReadMessageToken$1) {
            supportConversationPersistence$updateLastReadMessageToken$1 = (SupportConversationPersistence$updateLastReadMessageToken$1) continuationImpl;
            int i3 = supportConversationPersistence$updateLastReadMessageToken$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                supportConversationPersistence$updateLastReadMessageToken$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = supportConversationPersistence$updateLastReadMessageToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportConversationPersistence$updateLastReadMessageToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof RecordedMessage) {
                            arrayList2.add(obj3);
                        }
                    }
                    supportConversationPersistence$updateLastReadMessageToken$1.L$0 = str;
                    supportConversationPersistence$updateLastReadMessageToken$1.L$2 = arrayList2;
                    supportConversationPersistence$updateLastReadMessageToken$1.label = 1;
                    Object lastReadMessageToken = getLastReadMessageToken(supportConversationPersistence$updateLastReadMessageToken$1);
                    if (lastReadMessageToken != obj2) {
                        str2 = str;
                        arrayList = arrayList2;
                        obj = lastReadMessageToken;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = supportConversationPersistence$updateLastReadMessageToken$1.L$2;
                str2 = supportConversationPersistence$updateLastReadMessageToken$1.L$0;
                SafeTrace.throwOnFailure(obj);
                String str3 = (String) obj;
                listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    RecordedMessage recordedMessage = (RecordedMessage) listIterator.previous();
                    if (Intrinsics.areEqual(recordedMessage.getMessageToken(), str2) || Intrinsics.areEqual(recordedMessage.getMessageToken(), str3)) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                }
                i2 = -1;
                if (i2 >= 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("Token not in transcript.");
                    return null;
                }
                RecordedMessage recordedMessage2 = (RecordedMessage) CollectionsKt.lastOrNull(arrayList.subList(0, i2 + 1));
                if (recordedMessage2 != null && (messageToken = recordedMessage2.getMessageToken()) != null && !messageToken.equals(str3)) {
                    ChatLastReadMessageToken chatLastReadMessageToken = new ChatLastReadMessageToken(messageToken);
                    supportConversationPersistence$updateLastReadMessageToken$1.L$0 = null;
                    supportConversationPersistence$updateLastReadMessageToken$1.L$2 = null;
                    supportConversationPersistence$updateLastReadMessageToken$1.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        supportConversationPersistence$updateLastReadMessageToken$1 = new SupportConversationPersistence$updateLastReadMessageToken$1(this, continuationImpl);
        Object obj4 = supportConversationPersistence$updateLastReadMessageToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportConversationPersistence$updateLastReadMessageToken$1.label;
        if (i != 0) {
        }
        String str32 = (String) obj4;
        listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
        }
        i2 = -1;
        if (i2 >= 0) {
        }
    }
}
