package cn.hutool.core.net;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.n;
import cn.hutool.core.lang.a0;
import cn.hutool.core.util.b0;
import cn.hutool.core.util.c1;
import cn.hutool.core.util.i0;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Authenticator;
import java.net.DatagramSocket;
import java.net.HttpCookie;
import java.net.IDN;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;

/* loaded from: classes.dex */
public class j {
    public static final String LOCAL_IP = "127.0.0.1";
    public static final int PORT_RANGE_MAX = 65535;
    public static final int PORT_RANGE_MIN = 1024;
    public static String localhostName;

    public static String bigIntegerToIPv6(BigInteger bigInteger) {
        try {
            return InetAddress.getByAddress(bigInteger.toByteArray()).toString().substring(1);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static InetSocketAddress buildInetSocketAddress(String str, int i8) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            str = "127.0.0.1";
        }
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            i8 = Integer.parseInt(str.substring(indexOf + 1));
            str = substring;
        }
        return new InetSocketAddress(str, i8);
    }

    public static InetSocketAddress createAddress(String str, int i8) {
        return cn.hutool.core.text.l.isBlank(str) ? new InetSocketAddress(i8) : new InetSocketAddress(str, i8);
    }

    public static List<String> getDnsInfo(String str, String... strArr) {
        Attributes attributes = b0.getAttributes(cn.hutool.core.text.l.addPrefixIfNot(str, "dns:"), strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = new EnumerationIter(attributes.getAll()).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((String) ((Attribute) it.next()).get());
            } catch (NamingException unused) {
            }
        }
        return arrayList;
    }

    public static byte[] getHardwareAddress(InetAddress inetAddress) {
        if (inetAddress == null) {
            return null;
        }
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (SocketException e8) {
            throw new UtilException(e8);
        }
    }

    public static String getIpByHost(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }

    public static byte[] getLocalHardwareAddress() {
        return getHardwareAddress(getLocalhost());
    }

    public static String getLocalHostName() {
        if (cn.hutool.core.text.l.isNotBlank(localhostName)) {
            return localhostName;
        }
        InetAddress localhost = getLocalhost();
        if (localhost != null) {
            String hostName = localhost.getHostName();
            if (cn.hutool.core.text.l.isEmpty(hostName)) {
                hostName = localhost.getHostAddress();
            }
            localhostName = hostName;
        }
        return localhostName;
    }

    public static String getLocalMacAddress() {
        return getMacAddress(getLocalhost());
    }

    public static InetAddress getLocalhost() {
        LinkedHashSet<InetAddress> localAddressList = localAddressList(new a0() { // from class: cn.hutool.core.net.i
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$getLocalhost$2;
                lambda$getLocalhost$2 = j.lambda$getLocalhost$2((InetAddress) obj);
                return lambda$getLocalhost$2;
            }
        });
        if (CollUtil.isNotEmpty((Collection<?>) localAddressList)) {
            Iterator<InetAddress> it = localAddressList.iterator();
            InetAddress inetAddress = null;
            while (it.hasNext()) {
                InetAddress next = it.next();
                if (!next.isSiteLocalAddress()) {
                    return next;
                }
                if (inetAddress == null) {
                    inetAddress = next;
                }
            }
            if (inetAddress != null) {
                return inetAddress;
            }
        }
        try {
            return InetAddress.getLocalHost();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static String getLocalhostStr() {
        InetAddress localhost = getLocalhost();
        if (localhost != null) {
            return localhost.getHostAddress();
        }
        return null;
    }

    public static String getMacAddress(InetAddress inetAddress) {
        return getMacAddress(inetAddress, "-");
    }

    public static String getMultistageReverseProxyIp(String str) {
        if (str == null || cn.hutool.core.text.l.indexOf(str, ',') <= 0) {
            return str;
        }
        for (String str2 : cn.hutool.core.text.l.splitTrim((CharSequence) str, ',')) {
            if (!isUnknown(str2)) {
                return str2;
            }
        }
        return str;
    }

    public static NetworkInterface getNetworkInterface(String str) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null && str.equals(nextElement.getName())) {
                    return nextElement;
                }
            }
        } catch (SocketException unused) {
        }
        return null;
    }

    public static Collection<NetworkInterface> getNetworkInterfaces() {
        try {
            return CollUtil.addAll((Collection) new ArrayList(), (Enumeration) NetworkInterface.getNetworkInterfaces());
        } catch (SocketException unused) {
            return null;
        }
    }

    public static int getUsableLocalPort() {
        return getUsableLocalPort(1024);
    }

    public static TreeSet<Integer> getUsableLocalPorts(int i8, int i9, int i10) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int i11 = 0;
        while (true) {
            i11++;
            if (i11 > i8 + 100 || treeSet.size() >= i8) {
                break;
            }
            treeSet.add(Integer.valueOf(getUsableLocalPort(i9, i10)));
        }
        if (treeSet.size() == i8) {
            return treeSet;
        }
        throw new UtilException("Could not find {} available  ports in the range [{}, {}]", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static String hideIpPart(String str) {
        StringBuilder builder = c1.builder(str.length());
        builder.append((CharSequence) str, 0, str.lastIndexOf(".") + 1);
        builder.append("*");
        return builder.toString();
    }

    public static String idnToASCII(String str) {
        return IDN.toASCII(str);
    }

    public static long ipv4ToLong(String str) {
        return e.ipv4ToLong(str);
    }

    public static BigInteger ipv6ToBigInteger(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName instanceof Inet6Address) {
                return new BigInteger(1, byName.getAddress());
            }
            return null;
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Deprecated
    public static BigInteger ipv6ToBitInteger(String str) {
        return ipv6ToBigInteger(str);
    }

    public static boolean isInRange(String str, String str2) {
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            long parseInt = (-1) << (32 - Integer.parseInt(str2.substring(lastIndexOf + 1)));
            return (ipv4ToLong(str) & parseInt) == (ipv4ToLong(str2.substring(0, lastIndexOf)) & parseInt);
        }
        throw new IllegalArgumentException("Invalid cidr: " + str2);
    }

    public static boolean isInnerIP(String str) {
        return e.isInnerIP(str);
    }

    public static boolean isOpen(InetSocketAddress inetSocketAddress, int i8) {
        try {
            Socket socket = new Socket();
            try {
                socket.connect(inetSocketAddress, i8);
                socket.close();
                return true;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUnknown(String str) {
        return cn.hutool.core.text.l.isBlank(str) || "unknown".equalsIgnoreCase(str);
    }

    public static boolean isUsableLocalPort(int i8) {
        if (!isValidPort(i8)) {
            return false;
        }
        try {
            ServerSocket serverSocket = new ServerSocket(i8);
            try {
                serverSocket.setReuseAddress(true);
                serverSocket.close();
                try {
                    DatagramSocket datagramSocket = new DatagramSocket(i8);
                    try {
                        datagramSocket.setReuseAddress(true);
                        datagramSocket.close();
                        return true;
                    } finally {
                    }
                } catch (IOException unused) {
                    return false;
                }
            } finally {
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    public static boolean isValidPort(int i8) {
        return i8 >= 0 && i8 <= 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getLocalhost$2(InetAddress inetAddress) {
        return !inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$localIpv4s$0(InetAddress inetAddress) {
        return inetAddress instanceof Inet4Address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$localIpv6s$1(InetAddress inetAddress) {
        return inetAddress instanceof Inet6Address;
    }

    public static LinkedHashSet<InetAddress> localAddressList(a0 a0Var) {
        return localAddressList(null, a0Var);
    }

    public static LinkedHashSet<String> localIps() {
        return toIpList(localAddressList(null));
    }

    public static LinkedHashSet<String> localIpv4s() {
        return toIpList(localAddressList(new a0() { // from class: cn.hutool.core.net.h
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$localIpv4s$0;
                lambda$localIpv4s$0 = j.lambda$localIpv4s$0((InetAddress) obj);
                return lambda$localIpv4s$0;
            }
        }));
    }

    public static LinkedHashSet<String> localIpv6s() {
        return toIpList(localAddressList(new a0() { // from class: cn.hutool.core.net.g
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$localIpv6s$1;
                lambda$localIpv6s$1 = j.lambda$localIpv6s$1((InetAddress) obj);
                return lambda$localIpv6s$1;
            }
        }));
    }

    public static String longToIpv4(long j8) {
        return e.longToIpv4(j8);
    }

    public static void netCat(String str, int i8, boolean z7, ByteBuffer byteBuffer) {
        try {
            SocketChannel open = SocketChannel.open(createAddress(str, i8));
            try {
                open.configureBlocking(z7);
                open.write(byteBuffer);
                open.close();
            } finally {
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static List<HttpCookie> parseCookies(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? Collections.emptyList() : HttpCookie.parse(str);
    }

    public static boolean ping(String str) {
        return ping(str, 200);
    }

    public static void setGlobalAuthenticator(String str, char[] cArr) {
        setGlobalAuthenticator(new m(str, cArr));
    }

    public static String toAbsoluteUrl(String str, String str2) {
        try {
            return new URL(new URL(str), str2).toString();
        } catch (Exception e8) {
            throw new UtilException(e8, "To absolute url [{}] base [{}] error!", str2, str);
        }
    }

    public static LinkedHashSet<String> toIpList(Set<InetAddress> set) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Iterator<InetAddress> it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getHostAddress());
        }
        return linkedHashSet;
    }

    public static String getMacAddress(InetAddress inetAddress, String str) {
        byte[] hardwareAddress;
        if (inetAddress == null || (hardwareAddress = getHardwareAddress(inetAddress)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < hardwareAddress.length; i8++) {
            if (i8 != 0) {
                sb.append(str);
            }
            String hexString = Integer.toHexString(hardwareAddress[i8] & 255);
            if (hexString.length() == 1) {
                hexString = 0 + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static int getUsableLocalPort(int i8) {
        return getUsableLocalPort(i8, 65535);
    }

    public static String hideIpPart(long j8) {
        return hideIpPart(longToIpv4(j8));
    }

    public static LinkedHashSet<InetAddress> localAddressList(a0 a0Var, a0 a0Var2) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                throw new UtilException("Get network interface error!");
            }
            LinkedHashSet<InetAddress> linkedHashSet = new LinkedHashSet<>();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (a0Var == null || a0Var.accept(nextElement)) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 != null && (a0Var2 == null || a0Var2.accept(nextElement2))) {
                            linkedHashSet.add(nextElement2);
                        }
                    }
                }
            }
            return linkedHashSet;
        } catch (SocketException e8) {
            throw new UtilException(e8);
        }
    }

    public static boolean ping(String str, int i8) {
        try {
            return InetAddress.getByName(str).isReachable(i8);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setGlobalAuthenticator(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }

    public static int getUsableLocalPort(int i8, int i9) {
        int i10 = i9 + 1;
        for (int i11 = i8; i11 < i10; i11++) {
            int randomInt = i0.randomInt(i8, i10);
            if (isUsableLocalPort(randomInt)) {
                return randomInt;
            }
        }
        throw new UtilException("Could not find an available port in the range [{}, {}] after {} attempts", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i9 - i8));
    }

    public static void netCat(String str, int i8, byte[] bArr) {
        try {
            try {
                Socket socket = new Socket(str, i8);
                try {
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    socket.close();
                    n.close((Closeable) outputStream);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            socket.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } catch (Throwable th4) {
            n.close((Closeable) null);
            throw th4;
        }
    }
}
