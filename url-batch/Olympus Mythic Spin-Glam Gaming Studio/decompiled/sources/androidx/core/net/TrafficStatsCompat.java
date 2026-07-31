package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.SocketException;

/* loaded from: classes4.dex */
public final class TrafficStatsCompat {

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static void tagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @DoNotInline
        static void untagDatagramSocket(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }
}
