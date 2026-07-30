package com.crrepa.ble.nrf.dfu.internal.scanner;

/* loaded from: classes3.dex */
public class BootloaderScannerFactory {
    public static BootloaderScanner getScanner() {
        return new BootloaderScannerLollipop();
    }
}
