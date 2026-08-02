package com.squareup.cash.transfers.screens;

import app.cash.broadway.screen.Screen;
import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes.dex */
public interface InstrumentDetailsScreen extends TransfersScreens {
    String getInstrumentToken();

    CashInstrumentType getInstrumentType();

    Screen getParentScreen();
}
