package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.InlineList;

/* loaded from: classes3.dex */
public interface Channel extends SendChannel, ReceiveChannel {
    public static final Factory Factory = Factory.$$INSTANCE;

    public final class Factory {
        public static final /* synthetic */ Factory $$INSTANCE = new Factory();
        public static final int CHANNEL_DEFAULT_CAPACITY = (int) InlineList.systemProp(64, "kotlinx.coroutines.channels.defaultBuffer", 1, 2147483646);
    }
}
