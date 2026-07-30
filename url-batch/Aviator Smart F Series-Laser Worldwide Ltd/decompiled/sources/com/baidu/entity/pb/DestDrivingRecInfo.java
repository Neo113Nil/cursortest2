package com.baidu.entity.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class DestDrivingRecInfo extends MessageMicro {
    public static final int BOARD_ITEMS_FIELD_NUMBER = 5;
    public static final int BROADCAST_CONTENT_FIELD_NUMBER = 4;
    public static final int RECT_BOARD_ITEMS_FIELD_NUMBER = 7;
    public static final int REC_PARKING_TEXT_FIELD_NUMBER = 3;
    public static final int SCENE_TYPE_FIELD_NUMBER = 1;
    public static final int TAB_POI_INFO_FIELD_NUMBER = 2;
    public static final int TRANSHIP_INFO_FIELD_NUMBER = 6;
    private List<DestItems> boardItems_;
    private ByteStringMicro broadcastContent_;
    private int cachedSize;
    private boolean hasBroadcastContent;
    private boolean hasRecParkingText;
    private boolean hasSceneType;
    private boolean hasTranshipInfo;
    private ByteStringMicro recParkingText_;
    private List<RectBoard> rectBoardItems_;
    private int sceneType_ = 1;
    private List<TabPoiInfo> tabPoiInfo_ = Collections.emptyList();
    private TranshipInfo transhipInfo_;

    public DestDrivingRecInfo() {
        ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
        this.recParkingText_ = byteStringMicro;
        this.broadcastContent_ = byteStringMicro;
        this.boardItems_ = Collections.emptyList();
        this.transhipInfo_ = null;
        this.rectBoardItems_ = Collections.emptyList();
        this.cachedSize = -1;
    }

    public static DestDrivingRecInfo parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new DestDrivingRecInfo().mergeFrom(codedInputStreamMicro);
    }

    public DestDrivingRecInfo addBoardItems(DestItems destItems) {
        if (destItems == null) {
            return this;
        }
        if (this.boardItems_.isEmpty()) {
            this.boardItems_ = new ArrayList();
        }
        this.boardItems_.add(destItems);
        return this;
    }

    public DestDrivingRecInfo addRectBoardItems(RectBoard rectBoard) {
        if (rectBoard == null) {
            return this;
        }
        if (this.rectBoardItems_.isEmpty()) {
            this.rectBoardItems_ = new ArrayList();
        }
        this.rectBoardItems_.add(rectBoard);
        return this;
    }

    public DestDrivingRecInfo addTabPoiInfo(TabPoiInfo tabPoiInfo) {
        if (tabPoiInfo == null) {
            return this;
        }
        if (this.tabPoiInfo_.isEmpty()) {
            this.tabPoiInfo_ = new ArrayList();
        }
        this.tabPoiInfo_.add(tabPoiInfo);
        return this;
    }

    public final DestDrivingRecInfo clear() {
        clearSceneType();
        clearTabPoiInfo();
        clearRecParkingText();
        clearBroadcastContent();
        clearBoardItems();
        clearTranshipInfo();
        clearRectBoardItems();
        this.cachedSize = -1;
        return this;
    }

    public DestDrivingRecInfo clearBoardItems() {
        this.boardItems_ = Collections.emptyList();
        return this;
    }

    public DestDrivingRecInfo clearBroadcastContent() {
        this.hasBroadcastContent = false;
        this.broadcastContent_ = ByteStringMicro.EMPTY;
        return this;
    }

    public DestDrivingRecInfo clearRecParkingText() {
        this.hasRecParkingText = false;
        this.recParkingText_ = ByteStringMicro.EMPTY;
        return this;
    }

    public DestDrivingRecInfo clearRectBoardItems() {
        this.rectBoardItems_ = Collections.emptyList();
        return this;
    }

    public DestDrivingRecInfo clearSceneType() {
        this.hasSceneType = false;
        this.sceneType_ = 1;
        return this;
    }

    public DestDrivingRecInfo clearTabPoiInfo() {
        this.tabPoiInfo_ = Collections.emptyList();
        return this;
    }

    public DestDrivingRecInfo clearTranshipInfo() {
        this.hasTranshipInfo = false;
        this.transhipInfo_ = null;
        return this;
    }

    public DestItems getBoardItems(int i8) {
        return this.boardItems_.get(i8);
    }

    public int getBoardItemsCount() {
        return this.boardItems_.size();
    }

    public List<DestItems> getBoardItemsList() {
        return this.boardItems_;
    }

    public ByteStringMicro getBroadcastContent() {
        return this.broadcastContent_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public ByteStringMicro getRecParkingText() {
        return this.recParkingText_;
    }

    public RectBoard getRectBoardItems(int i8) {
        return this.rectBoardItems_.get(i8);
    }

    public int getRectBoardItemsCount() {
        return this.rectBoardItems_.size();
    }

    public List<RectBoard> getRectBoardItemsList() {
        return this.rectBoardItems_;
    }

    public int getSceneType() {
        return this.sceneType_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasSceneType() ? CodedOutputStreamMicro.computeInt32Size(1, getSceneType()) : 0;
        Iterator<TabPoiInfo> it = getTabPoiInfoList().iterator();
        while (it.hasNext()) {
            computeInt32Size += CodedOutputStreamMicro.computeMessageSize(2, it.next());
        }
        if (hasRecParkingText()) {
            computeInt32Size += CodedOutputStreamMicro.computeBytesSize(3, getRecParkingText());
        }
        if (hasBroadcastContent()) {
            computeInt32Size += CodedOutputStreamMicro.computeBytesSize(4, getBroadcastContent());
        }
        Iterator<DestItems> it2 = getBoardItemsList().iterator();
        while (it2.hasNext()) {
            computeInt32Size += CodedOutputStreamMicro.computeMessageSize(5, it2.next());
        }
        if (hasTranshipInfo()) {
            computeInt32Size += CodedOutputStreamMicro.computeMessageSize(6, getTranshipInfo());
        }
        Iterator<RectBoard> it3 = getRectBoardItemsList().iterator();
        while (it3.hasNext()) {
            computeInt32Size += CodedOutputStreamMicro.computeMessageSize(7, it3.next());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public TabPoiInfo getTabPoiInfo(int i8) {
        return this.tabPoiInfo_.get(i8);
    }

    public int getTabPoiInfoCount() {
        return this.tabPoiInfo_.size();
    }

    public List<TabPoiInfo> getTabPoiInfoList() {
        return this.tabPoiInfo_;
    }

    public TranshipInfo getTranshipInfo() {
        return this.transhipInfo_;
    }

    public boolean hasBroadcastContent() {
        return this.hasBroadcastContent;
    }

    public boolean hasRecParkingText() {
        return this.hasRecParkingText;
    }

    public boolean hasSceneType() {
        return this.hasSceneType;
    }

    public boolean hasTranshipInfo() {
        return this.hasTranshipInfo;
    }

    public final boolean isInitialized() {
        Iterator<TabPoiInfo> it = getTabPoiInfoList().iterator();
        while (it.hasNext()) {
            if (!it.next().isInitialized()) {
                return false;
            }
        }
        return !hasTranshipInfo() || getTranshipInfo().isInitialized();
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public DestDrivingRecInfo mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                setSceneType(codedInputStreamMicro.readInt32());
            } else if (readTag == 18) {
                TabPoiInfo tabPoiInfo = new TabPoiInfo();
                codedInputStreamMicro.readMessage(tabPoiInfo);
                addTabPoiInfo(tabPoiInfo);
            } else if (readTag == 26) {
                setRecParkingText(codedInputStreamMicro.readBytes());
            } else if (readTag == 34) {
                setBroadcastContent(codedInputStreamMicro.readBytes());
            } else if (readTag == 42) {
                DestItems destItems = new DestItems();
                codedInputStreamMicro.readMessage(destItems);
                addBoardItems(destItems);
            } else if (readTag == 50) {
                TranshipInfo transhipInfo = new TranshipInfo();
                codedInputStreamMicro.readMessage(transhipInfo);
                setTranshipInfo(transhipInfo);
            } else if (readTag == 58) {
                RectBoard rectBoard = new RectBoard();
                codedInputStreamMicro.readMessage(rectBoard);
                addRectBoardItems(rectBoard);
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public DestDrivingRecInfo setBoardItems(int i8, DestItems destItems) {
        if (destItems == null) {
            return this;
        }
        this.boardItems_.set(i8, destItems);
        return this;
    }

    public DestDrivingRecInfo setBroadcastContent(ByteStringMicro byteStringMicro) {
        this.hasBroadcastContent = true;
        this.broadcastContent_ = byteStringMicro;
        return this;
    }

    public DestDrivingRecInfo setRecParkingText(ByteStringMicro byteStringMicro) {
        this.hasRecParkingText = true;
        this.recParkingText_ = byteStringMicro;
        return this;
    }

    public DestDrivingRecInfo setRectBoardItems(int i8, RectBoard rectBoard) {
        if (rectBoard == null) {
            return this;
        }
        this.rectBoardItems_.set(i8, rectBoard);
        return this;
    }

    public DestDrivingRecInfo setSceneType(int i8) {
        this.hasSceneType = true;
        this.sceneType_ = i8;
        return this;
    }

    public DestDrivingRecInfo setTabPoiInfo(int i8, TabPoiInfo tabPoiInfo) {
        if (tabPoiInfo == null) {
            return this;
        }
        this.tabPoiInfo_.set(i8, tabPoiInfo);
        return this;
    }

    public DestDrivingRecInfo setTranshipInfo(TranshipInfo transhipInfo) {
        if (transhipInfo == null) {
            return clearTranshipInfo();
        }
        this.hasTranshipInfo = true;
        this.transhipInfo_ = transhipInfo;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasSceneType()) {
            codedOutputStreamMicro.writeInt32(1, getSceneType());
        }
        Iterator<TabPoiInfo> it = getTabPoiInfoList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(2, it.next());
        }
        if (hasRecParkingText()) {
            codedOutputStreamMicro.writeBytes(3, getRecParkingText());
        }
        if (hasBroadcastContent()) {
            codedOutputStreamMicro.writeBytes(4, getBroadcastContent());
        }
        Iterator<DestItems> it2 = getBoardItemsList().iterator();
        while (it2.hasNext()) {
            codedOutputStreamMicro.writeMessage(5, it2.next());
        }
        if (hasTranshipInfo()) {
            codedOutputStreamMicro.writeMessage(6, getTranshipInfo());
        }
        Iterator<RectBoard> it3 = getRectBoardItemsList().iterator();
        while (it3.hasNext()) {
            codedOutputStreamMicro.writeMessage(7, it3.next());
        }
    }

    public static DestDrivingRecInfo parseFrom(byte[] bArr) {
        return (DestDrivingRecInfo) new DestDrivingRecInfo().mergeFrom(bArr);
    }
}
